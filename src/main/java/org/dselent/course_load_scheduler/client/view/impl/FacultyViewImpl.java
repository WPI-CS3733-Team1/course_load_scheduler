package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.FacultyView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class FacultyViewImpl extends BaseViewImpl<FacultyPresenter> implements FacultyView {

	private static FacultyViewImplUiBinder uiBinder = GWT.create(FacultyViewImplUiBinder.class);

	interface FacultyViewImplUiBinder extends UiBinder<Widget, FacultyViewImpl> {}
	
	@UiField
	DockPanel mainPanel;

	@UiField
	ScheduleViewImpl scheduleView;
	
	@UiField
	SideBarViewImpl scheduleSideBarView;
	
	@UiField
	FacultyTopBarViewImpl topBarViewView;

	@Inject
	public FacultyViewImpl(FacultyTopBarViewImpl topBarViewView, SideBarViewImpl scheduleSideBarView, ScheduleViewImpl scheduleView)
	{
		this.topBarViewView = topBarViewView;
		this.scheduleSideBarView = scheduleSideBarView;
		this.scheduleView = scheduleView;
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
		return mainPanel;
	}
	
	@Override
	public DockPanel getDockPanel() {
		return mainPanel;
	}

	@Override
	public ScheduleViewImpl getScheduleView() {
		return scheduleView;
	}

	@Override
	public SideBarViewImpl getScheduleSideBarView() {
		return scheduleSideBarView;
	}

	@Override
	public FacultyTopBarViewImpl getTopBarViewView() {
		return topBarViewView;
	}	
	
	

}
