package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.List;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SearchPresenter;
import org.dselent.course_load_scheduler.client.view.SearchView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;


public class SearchPresenterImpl extends BasePresenterImpl implements SearchPresenter
{
	private IndexPresenter parentPresenter;
	private SearchView view;

	@Inject
	public SearchPresenterImpl(IndexPresenter parentPresenter, SearchView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
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
		
		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public SearchView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}

	@Override
	public List<User> searchUsers(String deptID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> searchCourses(String deptID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
