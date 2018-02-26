package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SideBarAdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.SideBarAdminView;
import org.dselent.course_load_scheduler.client.view.SideBarView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class SideBarAdminViewImpl extends BaseViewImpl<SideBarAdminPresenter> implements SideBarAdminView  {

	private static SideBarAdminViewImplUiBinder uiBinder = GWT.create(SideBarAdminViewImplUiBinder.class);

	interface SideBarAdminViewImplUiBinder extends UiBinder<Widget, SideBarAdminViewImpl> {
	}

	public SideBarAdminViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
		
	@UiField HTMLPanel basePanel;
	@UiField Image profilePhoto;	
	@UiField Label profName;	
	@UiField Label profRank;
	@UiField Label profDepartment;	
	@UiField Label profEmail;
	
	@UiField ListBox listOfFaculty;
		
	@UiField Button generateScheduleButton;
	@UiField Button confirmScheduleButton;
	
	

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
	public Widget getWidgetContainer()
	{
		return this;
	}


	@Override
	public HasWidgets getViewRootPanel() {
		return basePanel;
	}

	@Override
	public void setPresenter(SideBarAdminPresenter presenter) {
		this.presenter = presenter;
		
		
	}
	
	

}
