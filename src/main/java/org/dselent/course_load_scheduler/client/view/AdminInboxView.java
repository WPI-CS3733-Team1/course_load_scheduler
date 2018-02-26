package org.dselent.course_load_scheduler.client.view;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.presenter.AdminInboxPresenter;

public interface AdminInboxView extends BaseView<AdminInboxPresenter>{

	void showErrorMessages(String errorMessages);

	void populateTable(ArrayList<Message> messageList);

}
