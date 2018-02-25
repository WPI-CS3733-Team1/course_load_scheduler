package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class FacultyViewImpl extends BaseViewImpl<FacultyPresenter> implements FacultyView {

	private static FacultyViewImplUiBinder uiBinder = GWT.create(FacultyViewImplUiBinder.class);

	interface FacultyViewImplUiBinder extends UiBinder<Widget, FacultyView> {}
	
	@UiField
	DockPanel mainPanel;
	
	@UiField
	HasWidgets centerPanel;
	
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
		return mainPanel; //absolute panel
	}

	@Override
	public HasWidgets getCenterPanel() {
		return centerPanel;
	}
	
	@Override
	public DockPanel getDockPanel() {
		return mainPanel;
	}	

}
