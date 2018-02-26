package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.event.SendOpenInboxEvent;

public interface AdminInboxPresenter extends BasePresenter{

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	//void AdminInbox();
	void onSendOpenInbox(SendOpenInboxEvent evt);
	void bind();
}
