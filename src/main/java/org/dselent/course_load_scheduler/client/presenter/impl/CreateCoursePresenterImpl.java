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
	private void sendCreateCourse(String courseName, String courseNumber, String courseDepartment, String courseConferences, String courseLectures, String courseLabs)
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SendCreateCourseAction scca = new SendCreateCourseAction(courseName, courseNumber, courseDepartment, courseConferences, courseLectures, courseLabs);
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
		
		registration = eventBus.addHandler(InvalidCreateCourseEvent.TYPE, this);
		eventBusRegistration.put(InvalidCreateCourseEvent.TYPE, registration);	
	}
	
	private void validateCourseName(String courseName) throws EmptyStringException
	{
		checkEmptyString(courseName);
	}
	private void validateCourseNumber(String courseNumber) throws EmptyStringException
	{
		checkEmptyString(courseNumber);
	}
	private void validateCourseNumberOfLectures(String courseNumberOfLectures) throws EmptyStringException
	{
		checkEmptyString(courseNumberOfLectures);
	}
	private void validateCourseNumberOfConferences(String courseNumberOfConferences) throws EmptyStringException
	{
		checkEmptyString(courseNumberOfConferences);
	}
	private void validateCourseDeptId(String createCourseDepartment) throws EmptyStringException
	{
		checkEmptyString(createCourseDepartment);
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
			String courseLectures = view.getCourseNumberOfLectures().getText();
			String courseDepartment = view.getCreateCourseDeptId().getText();
			String courseConferences = view.getCourseNumberOfConferences().getText();
			String courseLabs = view.getCourseNumberOfLabs().getText();
			
			boolean validCourseName = true;
			boolean validCourseNumber = true;
			boolean validCourseDepartment = true;
			boolean validCourseConferences = true;
			boolean validCourseLabs = true;
			boolean validCourseLectures = true;
			
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
				validateCourseNumberOfLectures(courseLectures);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_NUM_LECTURES);
				validCourseLectures = false;
			}
			try
			{
				validateCourseNumberOfConferences(courseConferences);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_NUM_CONFERENCES);
			}
			try
			{
				validateCourseNumberOfLabs(courseLabs);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_NUM_LABS);
			}
			try
			{
				validateCourseDeptId(courseDepartment);
			}
			catch(EmptyStringException e)
			{
				invalidReasonList.add(InvalidCreateCourseStrings.NULL_COURSE_DEPARTMENT);
			}
			
			if(validCourseName && validCourseNumber && validCourseDepartment && validCourseLectures && validCourseLabs && validCourseConferences)
			{
				sendCreateCourse(courseName, courseNumber, courseDepartment, courseLectures, courseLabs, courseConferences);
			}
			else
			{
				InvalidCreateCourseAction icca = new InvalidCreateCourseAction(invalidReasonList.toString());
				InvalidCreateCourseEvent icce = new InvalidCreateCourseEvent(icca);
				eventBus.fireEvent(icce);
			}
		}
			
			
		}
	private void validateCourseNumberOfLabs(String courseLabs) throws EmptyStringException {
		checkEmptyString(courseLabs);
		
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
