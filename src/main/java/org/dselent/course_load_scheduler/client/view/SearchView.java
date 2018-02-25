package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.SearchPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;

public interface SearchView extends BaseView<SearchPresenter>
{
	RadioButton getUsersRadioButton();
	void setUsersRadioButton(RadioButton usersRadioButton);
	RadioButton getCoursesRadioButton();
	void setCoursesRadioButton(RadioButton coursesRadioButton);
	TextBox getDeptIDTextBox();
	void setDeptIDTextBox(TextBox nameTextBox);
	Button getSubmitButton();
	void setSubmitButton(Button submitButton);
}
