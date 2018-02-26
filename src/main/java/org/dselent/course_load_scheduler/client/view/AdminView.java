package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;

public interface AdminView extends BaseView<AdminPresenter> {

	AdminTopBarView getTopBarView();

}
