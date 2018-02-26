package org.dselent.course_load_scheduler.client.presenter;


public interface FacultyTopBarPresenter extends BasePresenter{
	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
	void FacultyTopBar();
	void openSchedule(String username, String string);
	void openSearch();
}
