package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.view.impl.FacultyTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ScheduleViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarViewImpl;

import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public interface FacultyView extends BaseView<FacultyPresenter>
{
	public DockPanel getDockPanel();

	ScheduleViewImpl getScheduleView();

	SideBarViewImpl getScheduleSideBarView();

	FacultyTopBarViewImpl getTopBarViewView();
}
