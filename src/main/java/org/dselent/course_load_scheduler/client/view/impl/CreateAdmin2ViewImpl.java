package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;

public class CreateAdmin2ViewImpl extends Composite implements HasText {

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
	ScrollPanel professorList;
	@UiField
	Label professorEntry;

	public CreateAdmin2ViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
/*
	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}
*/
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
	
	public Label getProfessorEntry() {
		return professorEntry;
	}
	
	public void setProfessorEntry(Label professorEntry) {
		this.professorEntry = professorEntry;
	}

	@UiHandler("professorEntry")
		void onProfessorEntryClick(ClickEvent event) {
	}

	@UiHandler("adminToggle")
		void onAdminToggleClick(ClickEvent event) {
	}
}
