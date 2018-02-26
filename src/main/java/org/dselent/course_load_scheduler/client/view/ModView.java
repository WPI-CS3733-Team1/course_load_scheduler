package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.ModPresenter;

import com.google.gwt.user.client.ui.DockPanel;

public interface ModView extends BaseView<ModPresenter> {
	public DockPanel getDockPanel();

	ModeratorTopBarView getTopBarView();

}
