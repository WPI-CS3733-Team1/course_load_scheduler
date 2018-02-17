package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SideBarTopViewImpl extends Composite {

	private static SideBarTopViewImplUiBinder uiBinder = GWT.create(SideBarTopViewImplUiBinder.class);

	interface SideBarTopViewImplUiBinder extends UiBinder<Widget, SideBarTopViewImpl> {
	}

	@UiField
	Image profilePhoto;
	
	@UiField
	Label profName;
	
	@UiField
	Label profRank;

	@UiField
	Label profDepartment;
	
	@UiField
	Label profEmail;
	
	public SideBarTopViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName.setText(profName);
	}

	public Label getProfRank() {
		return profRank;
	}

	public void setProfRank(String profRank) {
		this.profRank.setText(profRank);
	}

	public Label getProfDepartment() {
		return profDepartment;
	}

	public void setProfDepartment(String profDepartment) {
		this.profDepartment.setText(profDepartment);
	}

	public Label getProfEmail() {
		return profEmail;
	}

	public void setProfEmail(String profEmail) {
		this.profEmail.setText(profEmail);
	}
	
	

}
