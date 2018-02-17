package org.dselent.course_load_scheduler.client.presenter;

public interface AdminTopBarPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void AdminTopBar();
	void openInbox(String username);
	void openSearch(String username);
	void openSchedule(String username, String term);
}
