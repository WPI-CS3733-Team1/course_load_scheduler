package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface CreateCourseView extends BaseView<CreateCoursePresenter>
{
	TextBox getCourseNameTextBox();
	void setCourseNameTextBox(TextBox courseNameTextBox);
	TextBox getCourseNumberTextBox();
	void setCourseNumberTextBox(TextBox courseNumberTextBox);
	Label getCourseNameLabel();
	void setCourseNameLabel(Label courseNameLabel);
	Label getCourseNumberLabel();
	void setCourseNumberLabel(Label courseNumberLabel);
	TextBox getCourseNumberOfLectures();
	void setCourseNumberOfLectures(TextBox courseNumberOfLectures);
	TextBox getCourseNumberOfConferences();
	void setCourseNumberOfConferences(TextBox courseNumberOfConferences);
	TextBox getCourseNumberOfLabs();
	void setCourseNumberOfLabs(TextBox courseNumberOfLabs);
	Button getCreateCourseButton();
	void setCreateCourseButton(Button CourseButton);
	HorizontalPanel getCourseHorizontalPanel();
	void setCourseHorizontalPanel(HorizontalPanel createCourseHorizontalPanel);
	TextBox getCreateCourseDeptId();
	void setCourseDeptId(TextBox createCourseDepartment);
	
}
	

