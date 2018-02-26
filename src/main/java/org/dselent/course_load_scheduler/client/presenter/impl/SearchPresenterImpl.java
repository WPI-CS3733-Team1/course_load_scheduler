package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.SendSearchAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveSearchEvent;
import org.dselent.course_load_scheduler.client.event.SendSearchEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SearchPresenter;
import org.dselent.course_load_scheduler.client.view.SearchView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;


public class SearchPresenterImpl extends BasePresenterImpl implements SearchPresenter
{
	private BasePresenter parentPresenter;
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
		registration = eventBus.addHandler(ReceiveSearchEvent.TYPE, this);
		eventBusRegistration.put(ReceiveSearchEvent.TYPE, registration);
		
		HandlerRegistration ssUsers;
		ssUsers = eventBus.addHandler(SendSearchEvent.TYPE, this);
		eventBusRegistration.put(SendSearchEvent.TYPE, ssUsers);
		
		HandlerRegistration ssCourses;
		ssCourses = eventBus.addHandler(SendSearchEvent.TYPE, this);
		eventBusRegistration.put(SendSearchEvent.TYPE, ssCourses);
		
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
	public BasePresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(BasePresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}

	public void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}
	
	public boolean validateDeptID(String deptID) {
		try {
			checkEmptyString(deptID);
		}
		catch(EmptyStringException ese) {
			return false;
		}
		try {
			Integer.parseInt(deptID);
		}
		catch(NumberFormatException nfe) {
			return false;
		}
		return true;
		
	}
	
	@Override
	public void sendSearchUsers(String deptID) {
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		if (validateDeptID(deptID)) {
			SendSearchAction ssa = new SendSearchAction(deptID, "User");
			SendSearchEvent sse = new SendSearchEvent(ssa, container);
			eventBus.fireEvent(sse);
		}
		else return; //need to make invalid classes
		
	}

	@Override
	public void sendSearchCourses(String deptID) {
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		if (validateDeptID(deptID)) {
			SendSearchAction ssa = new SendSearchAction(deptID, "Course");
			SendSearchEvent sse = new SendSearchEvent(ssa, container);
			eventBus.fireEvent(sse);
		}
		else return; //need to make invalid classes
		
	}
	
	@Override
	public void onReceiveSearch(ReceiveSearchEvent rse) {
		//need to be able to display the information supplied by the send half of this
		// i.e. the users list or the courses list
		//and allow a user to select one from the list
	}
	
}
