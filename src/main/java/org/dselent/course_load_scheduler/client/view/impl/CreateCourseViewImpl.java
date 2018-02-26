package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;
import org.dselent.course_load_scheduler.client.view.CreateCourseView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CreateCourseViewImpl extends BaseViewImpl<CreateCoursePresenter> implements CreateCourseView
{
	private static CreateCourseViewImplUiBinder uiBinder = GWT.create(CreateCourseViewImplUiBinder.class);
	
	interface CreateCourseViewImplUiBinder extends UiBinder<Widget, CreateCourseViewImpl>{}
	
	@UiField
	Label courseNameLabel;
	
	@UiField
	Label courseNumberLabel;
	
	@UiField
	TextBox courseNameTextBox;
	
	@UiField
	TextBox courseNumberTextBox;
	
	@UiField
	TextBox courseNumberOfLectures;
	
	@UiField
	TextBox courseNumberOfLabs;
	
	@UiField
	TextBox courseNumberOfConferences;
	
	@UiField
	Button createCourseButton;
	
	@UiField
	VerticalPanel createCourseVerticalPanel;
	
	@UiField
	HorizontalPanel createCourseHorizontalPanel;
	
	@UiField
	ListBox courseListBox;
	
	@UiField
	TextBox createCourseDepartment;
	
	public CreateCourseViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
	@Override
	public void setPresenter(CreateCoursePresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return createCourseVerticalPanel;
	}


	@Override
	public TextBox getCourseNameTextBox() {
		return courseNameTextBox;
	}

	@Override
	public void setCourseNameTextBox(TextBox courseNameTextBox) {
		this.courseNameTextBox = courseNameTextBox;
		
	}

	@Override
	public TextBox getCourseNumberTextBox() {
		return courseNumberTextBox;
	}

	@Override
	public void setCourseNumberTextBox(TextBox courseNumberTextBox) {
		this.courseNumberTextBox = courseNumberTextBox;
		
	}

	@Override
	public Label getCourseNameLabel() {
		return courseNameLabel;
	}

	@Override
	public void setCourseNameLabel(Label courseNameLabel) {
		this.courseNameLabel = courseNameLabel;
		
	}

	@Override
	public Label getCourseNumberLabel() {
		return courseNumberLabel;
	}

	@Override
	public void setCourseNumberLabel(Label courseNumberLabel) {
		this.courseNumberLabel = courseNumberLabel;
		
	}
	
	@UiHandler("createCourseButton")
	void onCreateCourseButtonClicked(ClickEvent evt)
	{
		presenter.createCourse();
	}

	public void populateListBox(ArrayList<Course> courses) {
		for(int i = 0; i < courses.size(); i++) {
			Course newCourseObject = courses.get(i);
			String courseName = newCourseObject.getName();
			String courseNumber = newCourseObject.getCourseNum();
			Integer courseNumConferences = newCourseObject.getNumConferences();
			Integer courseNumLectures = newCourseObject.getNumLectures();
			Integer courseNumLabs = newCourseObject.getNumLabs();
			courseListBox.addItem(courseNumber); 
		}
	}



	@Override
	public Button getCreateCourseButton() {
		return createCourseButton;
	}


	@Override
	public void setCreateCourseButton(Button createCourseButton) {
		this.createCourseButton = createCourseButton;
		
	}


	@Override
	public HorizontalPanel getCourseHorizontalPanel() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCourseHorizontalPanel(HorizontalPanel createCourseHorizontalPanel) {
		// TODO Auto-generated method stub
		
	}


	public TextBox getCourseNumberOfLectures() {
		return courseNumberOfLectures;
	}


	public void setCourseNumberOfLectures(TextBox courseNumberOfLectures) {
		this.courseNumberOfLectures = courseNumberOfLectures;
	}


	public TextBox getCourseNumberOfLabs() {
		return courseNumberOfLabs;
	}


	public void setCourseNumberOfLabs(TextBox courseNumberOfLabs) {
		this.courseNumberOfLabs = courseNumberOfLabs;
	}


	public TextBox getCourseNumberOfConferences() {
		return courseNumberOfConferences;
	}


	public void setCourseNumberOfConferences(TextBox courseNumberOfConferences) {
		this.courseNumberOfConferences = courseNumberOfConferences;
	}


	public VerticalPanel getCreateCourseVerticalPanel() {
		return createCourseVerticalPanel;
	}


	public void setCreateCourseVerticalPanel(VerticalPanel createCourseVerticalPanel) {
		this.createCourseVerticalPanel = createCourseVerticalPanel;
	}


	public HorizontalPanel getCreateCourseHorizontalPanel() {
		return createCourseHorizontalPanel;
	}


	public void setCreateCourseHorizontalPanel(HorizontalPanel createCourseHorizontalPanel) {
		this.createCourseHorizontalPanel = createCourseHorizontalPanel;
	}


	public ListBox getCourseListBox() {
		return courseListBox;
	}


	public void setCourseListBox(ListBox courseListBox) {
		this.courseListBox = courseListBox;
	}

	@Override
	public TextBox getCreateCourseDeptId() {
		// TODO Auto-generated method stub
		return createCourseDepartment;
	}


	@Override
	public void setCourseDeptId(TextBox createCourseDepartment) {
		this.createCourseDepartment = createCourseDepartment;		
	}




}
