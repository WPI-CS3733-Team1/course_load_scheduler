package org.dselent.course_load_scheduler.client.presenter;


public interface FacultyTopBarPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void FacultyTopBar();
	void openSchedule(String username, String string);
	void openSearch(String userName);
}
