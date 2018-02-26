package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CreateAdminPresenter;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ToggleButton;

public interface CreateAdminView extends BaseView<CreateAdminPresenter> {
	Label getFirstNameLabel();
	void setFirstNameLabel(Label firstNameLabel);
	Label getLastNameLabel();
	void setLastNameLabel(Label lastNameLabel);
	Label getUserNameLabel();
	void setUserNameLabel(Label userNameLabel);
	Label getRoleLabel();
	void setRoleLabel(Label roleLabel);
	String getDepartmentLabel();
	void setDepartmentLabel(Label departmentLabel);
	ToggleButton getAdminToggle();
	void setAdminToggle(ToggleButton button);
	ListBox getProfessorList();
	void setProfessorList(ListBox professorList);
	HorizontalPanel getAdminHorizontalPanel();
	void setAdminHorizontalPanel(HorizontalPanel createAdminViewHorizontalPanel);
}
