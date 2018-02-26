package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.view.AdminTopBarView;

public interface AdminTopBarPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void AdminTopBar();
	void openInbox(String username);
	void openSearch(String username);
	void openSchedule(String username, String term);
	void setView(AdminTopBarView view);
}
