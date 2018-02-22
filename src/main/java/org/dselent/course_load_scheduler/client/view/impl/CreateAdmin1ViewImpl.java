package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.presenter.CreateAdmin1Presenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.view.CreateAdmin1View;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;

public class CreateAdmin1ViewImpl extends BaseViewImpl<CreateAdmin1Presenter> implements CreateAdmin1View {

	private static CreateAdmin1ViewUiBinder uiBinder = GWT.create(CreateAdmin1ViewUiBinder.class);

	interface CreateAdmin1ViewUiBinder extends UiBinder<Widget, CreateAdmin1ViewImpl> {
	}

	public CreateAdmin1ViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	HorizontalPanel createAdmin1ViewHorizontalPanel;
	@UiField
	Label firstNameLabel;
	@UiField
	Label lastNameLabel;
	@UiField
	Label userNameLabel;
	@UiField
	Label titleLabel;
	@UiField
	Label departmentLabel;
	@UiField
	ToggleButton adminToggle;
	@UiField
	ListBox professorList;

/*
	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}
*/
	public void setText(String text) {
		//button.setText(text);
	}

	public String getText() {
		return null; //button.getText();
	}

	@Override
	public void setPresenter(CreateAdmin1Presenter presenter) {
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
	public Label getTitleLabel() {
		return titleLabel;
	}
	
	@Override
	public void setTitleLabel(Label titleLabel) {
		this.titleLabel = titleLabel;
	}
	
	@Override
	public Label getDepartmentLabel() {
		return departmentLabel;
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
	public HorizontalPanel getAdmin1HorizontalPanel() {
		return createAdmin1ViewHorizontalPanel;
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
	
	@UiHandler("professorList")
	void onProfessorListClicked(ClickEvent evt) {
		presenter.selectUser();
	}
	
	@UiHandler("adminToggle")
	void onAdminToggleClicked(ClickEvent evt) {
		presenter.createAdmin1();
	}
}
