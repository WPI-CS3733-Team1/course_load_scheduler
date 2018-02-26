package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.presenter.CreateAdminPresenter;
import org.dselent.course_load_scheduler.client.view.CreateAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Widget;

public class CreateAdminViewImpl extends BaseViewImpl<CreateAdminPresenter> implements CreateAdminView {

	private static CreateAdminViewUiBinder uiBinder = GWT.create(CreateAdminViewUiBinder.class);

	interface CreateAdminViewUiBinder extends UiBinder<Widget, CreateAdminViewImpl> {
	}

	public CreateAdminViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	HorizontalPanel createAdminViewHorizontalPanel;
	@UiField
	Label firstNameLabel;
	@UiField
	Label lastNameLabel;
	@UiField
	Label userNameLabel;
	@UiField
	Label roleLabel;
	@UiField
	Label departmentLabel;
	@UiField
	ToggleButton adminToggle;
	@UiField
	ListBox professorList;

	@Override
	public void setPresenter(CreateAdminPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return null;
	}

	@Override
	public Label getFirstNameLabel() {
		return firstNameLabel;
	}
	
	@Override
	public void setFirstNameLabel(Label firstNameLabel) {
		this.firstNameLabel = firstNameLabel;
	}
	
	@Override
	public Label getLastNameLabel() {
		return lastNameLabel;
	}
	
	@Override
	public void setLastNameLabel(Label lastNameLabel) {
		this.lastNameLabel = lastNameLabel;
	}
	
	@Override
	public Label getUserNameLabel() {
		return userNameLabel;
	}
	
	@Override
	public void setUserNameLabel(Label userNameLabel) {
		this.userNameLabel = userNameLabel;
	}
	
	@Override
	public Label getRoleLabel() {
		return roleLabel;
	}
	
	@Override
	public void setRoleLabel(Label roleLabel) {
		this.roleLabel = roleLabel;
	}
	
	@Override
	public String getDepartmentLabel() {
		return departmentLabel.getText();
	}
	
	@Override
	public void setDepartmentLabel(Label departmentLabel) {
		this.departmentLabel = departmentLabel;
	}
	
	@Override
	public ToggleButton getAdminToggle() {
		return this.adminToggle;
	}
	
	@Override
	public void setAdminToggle(ToggleButton button) {
		this.adminToggle = button;
	}
	
	@Override
	public ListBox getProfessorList() {
		return professorList;
	}
	
	@Override
	public void setProfessorList(ListBox professorList) {
		this.professorList = professorList;
	}
	
	@Override
	public HorizontalPanel getAdminHorizontalPanel() {
		return createAdminViewHorizontalPanel;
	}
	
	public void populateListBox(ArrayList<User> users) {
		for (int i = 0; i < users.size() ; i++) {
			User newUserObject = users.get(i);
			String firstName = newUserObject.getFirstName();
			String lastName = newUserObject.getLastName();
			String userName = newUserObject.getUserName();
			professorList.addItem(firstName + "" + lastName, userName);
		}
	}
	
	@Override
	public void setAdminHorizontalPanel(HorizontalPanel createAdminViewHorizontalPane) {
		this.createAdminViewHorizontalPanel = createAdminViewHorizontalPane;
	}
	
	@UiHandler("professorList")
	void onProfessorListClicked(ClickEvent evt) {
		presenter.selectUser();
	}
	
	@UiHandler("adminToggle")
	void onAdminToggleClicked(ClickEvent evt) {
		presenter.createAdmin();
	}
}
