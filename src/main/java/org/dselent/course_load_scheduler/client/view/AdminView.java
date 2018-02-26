package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;

import com.google.gwt.user.client.ui.DockPanel;

public interface AdminView extends BaseView<AdminPresenter> {
	public DockPanel getDockPanel();
	
	AdminTopBarView getTopBarView();
	
	SideBarAdminView getSideBarView();
}
