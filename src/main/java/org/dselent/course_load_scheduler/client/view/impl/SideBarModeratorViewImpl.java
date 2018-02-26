package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SideBarModeratorPresenter;
import org.dselent.course_load_scheduler.client.view.SideBarAdminView;
import org.dselent.course_load_scheduler.client.view.SideBarModeratorView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SideBarModeratorViewImpl extends BaseViewImpl<SideBarModeratorPresenter> implements SideBarModeratorView   {

	private static SideBarModeratorViewImplUiBinder uiBinder = GWT.create(SideBarModeratorViewImplUiBinder.class);

	interface SideBarModeratorViewImplUiBinder extends UiBinder<Widget, SideBarModeratorViewImpl> {
	}

	public SideBarModeratorViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField HTMLPanel basePanel;
	@UiField Image profilePhoto;	
	@UiField Label profName;	
	@UiField Label profRank;
	@UiField Label profDepartment;	
	@UiField Label profEmail;
	
	
	public Image getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(Image profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public Label getProfName() {
		return profName;
	}
	public void setProfName(Label profName) {
		this.profName = profName;
	}
	public Label getProfRank() {
		return profRank;
	}
	public void setProfRank(Label profRank) {
		this.profRank = profRank;
	}
	public Label getProfDepartment() {
		return profDepartment;
	}
	public void setProfDepartment(Label profDepartment) {
		this.profDepartment = profDepartment;
	}
	public Label getProfEmail() {
		return profEmail;
	}
	public void setProfEmail(Label profEmail) {
		this.profEmail = profEmail;
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
	public void setPresenter(SideBarModeratorPresenter presenter) {
		this.presenter = presenter;
		
	}

	
	
}
