package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.InvalidCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidCreateCourseStrings;
import org.dselent.course_load_scheduler.client.event.InvalidCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendCreateCourseEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
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
	private void sendCreateCourse(String courseName, String courseNumber, String courseSections)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SendCreateCourseAction scca = new SendCreateCourseAction(courseName, courseNumber, courseSections);
		SendCreateCourseEvent scce = new SendCreateCourseEvent(scca, container);
		eventBus.fireEvent(scce);
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
		
		//registration = eventBus.addHandler(InvalidCreateCourseEvent.TYPE, this);
		//eventBusRegistration.put(InvalidCreateCourseEvent.TYPE, registration);	
	}
	
	private void validateCourseName(String courseName) throws EmptyStringException
	{
		checkEmptyString(courseName);
	}
	private void validateCourseNumber(String courseNumber) throws EmptyStringException
	{
		checkEmptyString(courseNumber);
	}
	private void validateCourseSections(String courseSections) throws EmptyStringException
	{
		checkEmptyString(courseSections);
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
	public CreateCourseView getView() {
		return view;
	}

	
	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}
	
	
	@Override
	public void createCourse() {
		if(!createCourseClickInProgress) {
			createCourseClickInProgress = true;
			view.getCreateCourseButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			String courseName = view.getCourseNameTextBox().getText();
			String courseNumber = view.getCourseNumberTextBox().getText();
			String courseSections = view.getCourseSectionsTextBox().getText();
			
			boolean validCourseName = true;
			boolean validCourseNumber = true;
			boolean validCourseSections = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try
			{
				validateCourseName(courseName);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_NAME);
				validCourseName = false;
			}
			try 
			{
				validateCourseNumber(courseNumber);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_NUMBER);
				validCourseNumber = false;
			}
			try
			{
				validateCourseSections(courseSections);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_SECTIONS);
				validCourseSections = false;
			}
			if(validCourseName && validCourseNumber && validCourseSections)
			{
				sendCreateCourse(courseName, courseNumber, courseSections);
			}
			else
			{
				InvalidCreateCourseAction icca = new InvalidCreateCourseAction(invalidReasonList);
				InvalidCreateCourseEvent icce = new InvalidCreateCourseEvent(icca);
				eventBus.fireEvent(icce);
			}
		}
			
			
		}
	private void checkEmptyString(String string) throws EmptyStringException
		{
			if(string == null || string.equals(""))
			{
				throw new EmptyStringException();
			}
	
		}

	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
}
