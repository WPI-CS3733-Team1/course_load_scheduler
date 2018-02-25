package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyMiddleView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class SideBarFacultyMiddleImpl extends BaseViewImpl<SideBarPresenter> implements SideBarFacultyMiddleView{

	private static SideBarFacultyMiddleImplUiBinder uiBinder = GWT.create(SideBarFacultyMiddleImplUiBinder.class);

	interface SideBarFacultyMiddleImplUiBinder extends UiBinder<Widget, SideBarFacultyMiddleImpl> {
	}

	public SideBarFacultyMiddleImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Button viewScheduleButton;
	@UiField Button requestChangeButton;
	
	public Button getViewScheduleButton() {
		return viewScheduleButton;
	}
	public void setViewScheduleButton(Button viewScheduleButton) {
		this.viewScheduleButton = viewScheduleButton;
	}
	public Button getRequestChangeButton() {
		return requestChangeButton;
	}
	public void setRequestChangeButton(Button requestChangeButton) {
		this.requestChangeButton = requestChangeButton;
	}
	@Override
	public void setPresenter(SideBarPresenter presenter) {
		this.presenter = presenter;
		
	}
	@Override
	public Widget getWidgetContainer() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
