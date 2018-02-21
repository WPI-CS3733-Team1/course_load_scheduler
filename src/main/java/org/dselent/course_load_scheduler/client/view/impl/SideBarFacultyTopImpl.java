package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyTopView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SideBarFacultyTopImpl extends BaseViewImpl<SideBarPresenter> implements SideBarFacultyTopView{

	private static SideBarTopViewImplUiBinder uiBinder = GWT.create(SideBarTopViewImplUiBinder.class);

	interface SideBarTopViewImplUiBinder extends UiBinder<Widget, SideBarFacultyTopImpl> {
	}

	@UiField Image profilePhoto;	
	@UiField Label profName;	
	@UiField Label profRank;
	@UiField Label profDepartment;	
	@UiField Label profEmail;
	
	public SideBarFacultyTopImpl() {
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

	@Override
	public void setPresenter(SideBarPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public Widget getWidgetContainer() {
		
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
