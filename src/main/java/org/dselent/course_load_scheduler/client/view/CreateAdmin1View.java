package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CreateAdmin1Presenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ToggleButton;

public interface CreateAdmin1View extends BaseView<CreateAdmin1Presenter> {
	public ListBox getProfessorList();
	public void setProfessorList(ListBox professorList);
	public HorizontalPanel getAdmin1HorizontalPanel();
	Label getFirstNameLabel();
	void setFirstNameLabel(Label firstNameLabel);
	Label getLastNameLabel();
	void setLastNameLabel(Label lastNameLabel);
	Label getUserNameLabel();
	void setUserNameLabel(Label userNameLabel);
	Label getTitleLabel();
	void setTitleLabel(Label titleLabel);
	Label getDepartmentLabel();
	void setDepartmentLabel(Label departmentLabel);
	ToggleButton getAdminToggle();
	void setAdminToggle(ToggleButton button);
}
