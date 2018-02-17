package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class FacultyPresenterImpl extends BasePresenterImpl implements FacultyPresenter {

	private IndexPresenter parentPresenter;
	private FacultyView view;
	
	//FacultyView needs layout getters
	@Inject
	public FacultyPresenterImpl(IndexPresenter parentPresenter, FacultyView view) {
		this.parentPresenter = parentPresenter;
		this.view = view;
		view.setPresenter(this);
	}
	
	public void addTopBarView(/*TopBarView*/) {
		//view.getTopPanel().add(view);
	}
	
	public void addSideBarView(/*SideBarView*/) {
		//view.getSidePanel().add(view);
	}
	
	public void addScheduleView(ScheduleView view) {
		//view.getMainPanel().add(View);
		//this.view.getMainPanel().add(view.getGrid());
		//this.view.getMainPanel().add(view.getWidgetContainer()); //questionable....
		//could pass view into go??
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
	public Model getModel() { //no model
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bind() {
		//nothing to put here yet
	}
}
