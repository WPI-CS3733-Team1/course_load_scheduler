package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class FacultyTopBarPresenterImpl extends BasePresenterImpl implements FacultyTopBarPresenter {

	private BasePresenter parentPresenter;
	private FacultyTopBarView view;
	Logger logger = java.util.logging.Logger.getLogger("[FacultyTopBarPresenter]");
	//public String userName = "dselent";
	
	/*
	 * Error: com.google.gwt.event.shared.UmbrellaException: Exception caught: (TypeError) : 
	 * Cannot read property 'openSchedule_0_g$' of undefined
	 * Cannot read property 'openSearch_1_g$' of undefined
	 * Cannot read property 'eventBus' of undefined  **
	 * 
	 * 
	 */
	
	@Inject
	public FacultyTopBarPresenterImpl(IndexPresenter parentPresenter, FacultyTopBarView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		log("Faculty Top Bar Presenter Initialized.");
		if(view.getPresenter()==null) {
			log("Faculty Top Bar Presenter was null!");
		}else {
			log("Faculty Top Bar Presenter was NOT null on construct");
		}
	}
	
	@Override
	public void init() {
		bind();
	}
		
	@Override
	public void bind() {
		
		HandlerRegistration registration;
		registration = eventBus.addHandler(OpenSearchEvent.TYPE, this);
		eventBusRegistration.put(OpenSearchEvent.TYPE, registration);
		
		HandlerRegistration reg;
		reg = eventBus.addHandler(OpenScheduleEvent.TYPE, this);
		eventBusRegistration.put(OpenScheduleEvent.TYPE, reg);
	}

	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public FacultyTopBarView getView() {
		return view;
	}

	@Override
	public BasePresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(BasePresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}

	@Override
	public void FacultyTopBar() {
	}

	@Override
	public void openSchedule(String username, String term) 	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel(); //this might have to change to be the specific DockPanel CENTER panel
		OpenScheduleAction osca = new OpenScheduleAction("dselent", term);
		OpenScheduleEvent osce = new OpenScheduleEvent(osca, container);
		eventBus.fireEvent(osce); //how is this going to connect to schedulePresenter/scheduleView?
	}

	@Override
	public void openSearch() 	{
		//System.out.println("open Search!");
		GWT.log("Test");
		log("openSearch() executed.");
		OpenSearchAction osa = new OpenSearchAction("dselent");
		OpenSearchEvent ose = new OpenSearchEvent(osa);
		eventBus.fireEvent(ose);
	} 
	
	public void log(String value) {
		logger.log(Level.SEVERE, value);
	}
	
}
