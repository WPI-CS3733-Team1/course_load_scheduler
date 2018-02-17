package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.CreateCourseView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CreateCoursePresenterImpl extends BasePresenterImpl implements CreateCoursePresenter 
{
	private IndexPresenter parentPresenter;
	private CreateCourseView view;
	private boolean createCourseClickInProgress;
	
	
	@Inject
	public CreateCoursePresenterImpl(IndexPresenter parentPresenter, CreateCourseView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		createCourseClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}
	
	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidCourseCreationEvent.TYPE, this);
		eventBusRegistration.put(InvalidCourseCreationEvent.TYPE, registration);	
	}
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
		
	}

	@Override
	public IndexPresenter getParentPresenter()
	{
		
		return parentPresenter;
	}
	
	@Override
	public BaseView<? extends BasePresenter> getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCourse() {
		// TODO Auto-generated method stub
		
	}
	

	
}
