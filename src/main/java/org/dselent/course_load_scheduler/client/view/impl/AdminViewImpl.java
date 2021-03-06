package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;
import org.dselent.course_load_scheduler.client.view.AdminView;
import org.dselent.course_load_scheduler.client.view.SideBarAdminView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class AdminViewImpl extends BaseViewImpl<AdminPresenter> implements AdminView {

	private static AdminViewImplUiBinder uiBinder = GWT.create(AdminViewImplUiBinder.class);

	interface AdminViewImplUiBinder extends UiBinder<Widget, AdminViewImpl> {
	}

	@UiField
	DockPanel adminViewDockPanel;
	
	@UiField
	AdminTopBarViewImpl adminTopBar;
	
	@UiField
	SideBarAdminViewImpl adminSideBar;
	
	@Override
	public AdminTopBarView getTopBarView() {
		return adminTopBar;
	}
	
	@Override
	public SideBarAdminView getSideBarView() {
		return adminSideBar;
	}
	
	public AdminViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public void setPresenter(AdminPresenter presenter) {
		this.presenter = presenter;
	}


	@Override
	public Widget getWidgetContainer() {
		return this;
	}


	@Override
	public HasWidgets getViewRootPanel() {
		return null;
	}


	@Override
	public DockPanel getDockPanel() {
		return adminViewDockPanel;
	}
}
