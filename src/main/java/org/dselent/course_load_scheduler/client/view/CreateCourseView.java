package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface CreateCourseView extends BaseView<CreateCoursePresenter>
{
	TextBox getCourseNameTextBox();
	void setCourseNameTextBox(TextBox courseNameTextBox);
	TextBox getCourseNumberTextBox();
	void setCourseNumberTextBox(TextBox courseNumberTextBox);
	TextBox getCourseSectionsTextBox();
	void setCourseSectionsTextBox(TextBox courseSectionsTextBox);
	Label getCourseNameLabel();
	void setCourseNameLabel(Label courseNameLabel);
	Label getCourseNumberLabel();
	void setCourseNumberLabel(Label courseNumberLabel);
	Label getCourseSectionsLabel();
	void setCourseSectionsLabel(Label courseSectionsLabel);
	Button getCreateCourseButton();
	void setCreateCourseButton(Button CourseButton);
}
	

