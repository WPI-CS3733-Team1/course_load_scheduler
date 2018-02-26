package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.action.SendOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendOpenScheduleRequestEvent;
import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.model.Section;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SearchView;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;


//FacultyView needs layout getters
	/*
	 * @author Noah
	 * 
	 */

public class FacultyPresenterImpl extends BasePresenterImpl implements FacultyPresenter {

	private IndexPresenter parentPresenter;
	private FacultyView view;
	private SchedulePresenter schedulePresenter;
	private SideBarPresenter sidebarPresenter;
	private FacultyTopBarPresenterImpl facultyTopPresenter;
	private SearchPresenterImpl searchPresenter;
	Logger logger = java.util.logging.Logger.getLogger("[FacultyTopBarPresenter]");
	
	@Inject
	public FacultyPresenterImpl(IndexPresenter parentPresenter, FacultyView view, SchedulePresenter schedulePresenter, SideBarPresenter sideBarPresenter, FacultyTopBarPresenterImpl facultyTopPresenter, SearchPresenterImpl searchPresenter)
	{
		this.parentPresenter = parentPresenter;
		this.view = view;
		this.schedulePresenter = schedulePresenter;
		this.sidebarPresenter = sideBarPresenter;
		this.facultyTopPresenter = facultyTopPresenter;
		this.searchPresenter = searchPresenter;
		
		//add searchPresenter.getView()
		view.setPresenter(this);
		
		//view.getTopBarViewView().getATerm().setText("AAAAAA");
		
		facultyTopPresenter.setView(view.getTopBarViewView());
		facultyTopPresenter.getView().setPresenter(facultyTopPresenter);
	}
	
	@Override
	public void init()
	{
		schedulePresenter.init();
		schedulePresenter.setParentPresenter(this);
		
		sidebarPresenter.init();
		sidebarPresenter.setParentPresenter(this);
		
		facultyTopPresenter.init();
		facultyTopPresenter.setParentPresenter(this);
		
		bind();
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public FacultyView getView() {
		return view;
	}

	@Override
	public void bind() {
		//nothing to put here yet
		//most event are triggered by internal views
		
		//open search event...
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(OpenSearchEvent.TYPE, this);
		eventBusRegistration.put(OpenSearchEvent.TYPE, registration);
		
		HandlerRegistration reg;
		reg = eventBus.addHandler(OpenScheduleEvent.TYPE, this);
		eventBusRegistration.put(OpenScheduleEvent.TYPE, reg);
		
		HandlerRegistration r;
		r = eventBus.addHandler(ReceiveScheduleEvent.TYPE, this);
		eventBusRegistration.put(ReceiveScheduleEvent.TYPE, r);
	}


	@Override
	public IndexPresenter getParentPresenter() {
		return parentPresenter;
	}


	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}
	
	@Override
	public void onOpenSearch(OpenSearchEvent evt) {
		
		logger.log(Level.SEVERE, "onOpenSearch executed.");
		DockPanel p = view.getDockPanel();
		p.remove(schedulePresenter.getView().getWidgetContainer());
		
		//p.add(searchPresenter.getView().getWidgetContainer(), DockPanel.CENTER);
		//searchView.getPresenter().go(view.getCenterPanel());
	}
	
	@Override
	public void onOpenSchedule(OpenScheduleEvent evt) {
		logger.log(Level.SEVERE, "onOpenSchedule executed in FacultyPresenterImpl");
		//fire sendopenschedulerequestevent?
		String user = evt.getAction().getUserName();
		SendOpenScheduleRequestAction action = new SendOpenScheduleRequestAction(user);
		SendOpenScheduleRequestEvent event = new SendOpenScheduleRequestEvent(action, schedulePresenter.getView().getViewRootPanel());
		eventBus.fireEvent(event);
	}
	
	public static native void alert(String msg) /*-{
	  $wnd.alert(msg);
	}-*/;
	
	@Override
	public void onReceiveSchedule(ReceiveScheduleEvent evt) {
		//may need to use this later to actually update the view
		//not sure if just inserting values with trigger an update
		HasWidgets container = evt.getContainer();
		
		ReceiveScheduleAction action = evt.getAction();
		List<Section> schedule = action.getSchedule();
		
		List<HashMap<String, String>> formattedSchedule = convertScheduleData(schedule);
		//
		//scheduleView.getPresenter().presentSchedule(formattedSchedule);
		schedulePresenter.presentSchedule(formattedSchedule);
		//schedulePresenter.go(container);
		//call go?
	}
	
	public List<HashMap<String, String>> convertScheduleData(List<Section> schedule) {
		//list of all sections and their times
		List<HashMap<String, String>> formattedSchedule = new ArrayList<HashMap<String, String>>();
		
		
		for(Section s : schedule) {
			
			Integer start = s.getStartTime();
			Integer end = s.getEndTime();
			
			if(start >= 1300) {
				start -= 1200;
			}
			if(end >= 1300) {
				end -= 1200;
			}
			
			String formattedStart = start.toString();
			String formattedEnd = end.toString();
			
			String timeblock = formattedStart+"-"+formattedEnd;
			
			Integer CRN = s.getCRN();
			String sectionName = s.getSectionName();
			String courseLocation = s.getCourseLocation();
			String formatted = CRN+" : "+sectionName+" : "+courseLocation;
			
			String daysPerWeek = s.getDaysPerWeek();
		
			//check though MTWTRF/other days per week value
			//Couldn't do a for-loop because of exception with Thursdays and Tuesdays
			//would have been ugly
			
			if(daysPerWeek.contains("M")) {
				formattedSchedule.get(0).put(timeblock, formatted);
			}
			if(daysPerWeek.contains("TR")) { //have to due thursday check first to avoid false positives on tuesday
				
				formattedSchedule.get(3).put(timeblock, formatted);
				daysPerWeek = daysPerWeek.replace("TR", "");
			}
			if(daysPerWeek.contains("T")) {
				formattedSchedule.get(1).put(timeblock, formatted);
			}
			if(daysPerWeek.contains("W")) {
				formattedSchedule.get(2).put(timeblock, formatted);
			}
			if(daysPerWeek.contains("F")) {
				formattedSchedule.get(4).put(timeblock, formatted);
			}
			
			
		//need a hashmap for each day
	}
		
		return formattedSchedule;
	}
}
