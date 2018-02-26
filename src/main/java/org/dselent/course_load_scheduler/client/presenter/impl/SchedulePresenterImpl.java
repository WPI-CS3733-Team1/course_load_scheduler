package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.inject.Inject;

public class SchedulePresenterImpl extends BasePresenterImpl implements SchedulePresenter {

	private FacultyPresenter parentPresenter;
	private ScheduleView view;
	
	
	@Inject
	public SchedulePresenterImpl(ScheduleView view)
	{
		this.view = view;
		view.setPresenter(this);
	}
	
	@Override
	public void init()
	{
		System.out.println("[SchedulePresenter] init() called!");
		bind();
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public ScheduleView getView() {
		// TODO Auto-generated method stub
		return view;
	}

	
	@Override
	public void bind() {
		/*
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
		*/
	}

	@Override
	public FacultyPresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(FacultyPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}

	//Noah - Assuming map of formatted strings with timeslots will come from service layer after
	// a openScheduleEvent....
	
	@Override
	public void presentSchedule(List<HashMap<String, String>> sections) {
		HashMap<String, InlineLabel> monday = view.getMondaySchedule();
		HashMap<String, InlineLabel> tuesday = view.getTuesdaySchedule();
		HashMap<String, InlineLabel> wednesday = view.getWednesdaySchedule();
		HashMap<String, InlineLabel> thursday = view.getThursdaySchedule();
		HashMap<String, InlineLabel> friday = view.getFridaySchedule();
		
		
		
		ArrayList<HashMap<String, InlineLabel>> list = new ArrayList<HashMap<String, InlineLabel>>();
		list.add(monday);
		list.add(tuesday);
		list.add(wednesday);
		list.add(thursday);
		list.add(friday);
		
		//iterates though list of daily schedules, sets text of InlineLabel to string inside Sections
		//both the list and sections are indexed by day
		for(HashMap<String, InlineLabel> map : list) {
			//for(string key : sections)
			for(int i = 0; i<sections.size();i++) {
				
				for(String key : sections.get(i).keySet()) { //iterates through each hashmap of timeblocks with formatted strings
					
					String section = sections.get(i).get(key);
					
					if(section!=null) {
						map.get(key).setText(section);
					}
				
				}
			
			}
		}
	}

}
