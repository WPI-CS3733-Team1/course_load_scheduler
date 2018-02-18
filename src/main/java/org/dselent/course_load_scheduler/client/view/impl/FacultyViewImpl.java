package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SideBarView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Header;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class FacultyViewImpl extends BaseViewImpl<FacultyPresenter> implements FacultyView {

	private static FacultyViewImplUiBinder uiBinder = GWT.create(FacultyViewImplUiBinder.class);

	interface FacultyViewImplUiBinder extends UiBinder<Widget, FacultyView> {}
	
	/*
	@UiField
	SideBarView sidebar;
	*/
	
	
	
	@UiField
	Label test;
	
	public FacultyViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
		
	@Override
	public void setPresenter(FacultyPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return null; //absolute panel
	}



	@Override
	public HTMLPanel getNavBar() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public HTMLPanel getMainPanel() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public HTMLPanel getSideBar() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
