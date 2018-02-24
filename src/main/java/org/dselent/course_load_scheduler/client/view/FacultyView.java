package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;

import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public interface FacultyView extends BaseView<FacultyPresenter>{
	public DockPanel getDockPanel();
}
