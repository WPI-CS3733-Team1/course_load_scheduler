package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminInboxPresenter;

public interface AdminInboxView extends BaseView<AdminInboxPresenter>{

	void showErrorMessages(String errorMessages);

}
