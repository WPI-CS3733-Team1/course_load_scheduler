package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;
import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.model.Section;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class FacultyPresenterImpl extends BasePresenterImpl implements FacultyPresenter {

	private IndexPresenter parentPresenter;
	private FacultyView view;
	
	
	
	
	//FacultyView needs layout getters
	/*
	 * @author Noah
	 * 
	 * TODO: Need to inject scheduleView so that onReceiveSchedule can be completely implemented
	 */
	@Inject
	public FacultyPresenterImpl(IndexPresenter parentPresenter, FacultyView view) {
		this.parentPresenter = parentPresenter;
		this.view = view;
		view.setPresenter(this);
	}
	
		
	@Override
	public void init() {
		bind();
	}

	@Override
	public void go(HasWidgets container) {
		//grab layouts from facultyview!!! insert
		container.clear();
		//
		container.add(view.getWidgetContainer());
		
	}

	@Override
	public FacultyView getView() {
		return view;
	}

	@Override
	public void bind() {
		//nothing to put here yet
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
	public void onReceiveSchedule(ReceiveScheduleEvent evt) {
		//update CENTER panel
		HasWidgets container = evt.getContainer();
		ReceiveScheduleAction action = evt.getAction();
		List<Section> schedule = action.getSchedule();
		
		
	
	}
}
