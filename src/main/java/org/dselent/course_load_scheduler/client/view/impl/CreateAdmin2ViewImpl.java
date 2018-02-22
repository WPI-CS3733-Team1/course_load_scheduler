package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.presenter.CreateAdmin1Presenter;
import org.dselent.course_load_scheduler.client.presenter.CreateAdmin2Presenter;
import org.dselent.course_load_scheduler.client.view.CreateAdmin1View;
import org.dselent.course_load_scheduler.client.view.CreateAdmin2View;

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
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;

public class CreateAdmin2ViewImpl extends BaseViewImpl<CreateAdmin2Presenter> implements CreateAdmin2View {

	private static CreateAdmin2ViewImplUiBinder uiBinder = GWT.create(CreateAdmin2ViewImplUiBinder.class);

	interface CreateAdmin2ViewImplUiBinder extends UiBinder<Widget, CreateAdmin2ViewImpl> {
	}

	public CreateAdmin2ViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

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

	public CreateAdmin2ViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
/*
	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}
*/
	
	@Override
	public Widget getWidgetContainer() {
		return this;
	}
	
	@Override
	public void setPresenter(CreateAdmin2Presenter presenter) {
		this.presenter = presenter;	
	}
	
	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setText(String text) {
		
	}

	public String getText() {
		return null;
	}
	
	public Label getFirstNameLabel() {
		return firstNameLabel;
	}
	
	public void setFirstNameLabel(Label firstNameLabel) {
		this.firstNameLabel = firstNameLabel;
	}
	
	public Label getLastNameLabel() {
		return lastNameLabel;
	}
	
	public void setLastNameLabel(Label lastNameLabel) {
		this.lastNameLabel = lastNameLabel;
	}
	
	public Label getUserNameLabel() {
		return userNameLabel;
	}
	
	public void setUserNameLabel(Label userNameLabel) {
		this.userNameLabel = userNameLabel;
	}
	
	public Label getTitleLabel() {
		return titleLabel;
	}
	
	public void setTitleLabel(Label titleLabel) {
		this.titleLabel = titleLabel;
	}
	
	public Label getDepartmentLabel() {
		return departmentLabel;
	}
	
	public void setDepartmentLabel(Label departmentLabel) {
		this.departmentLabel = departmentLabel;
	}
	
	public ListBox getProfessorList() {
		return professorList;
	}

	public void setProfessorList(ListBox professorList) {
		this.professorList = professorList;
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

	@UiHandler("adminToggle")
		void onAdminToggleClick(ClickEvent event) {
	}
}
