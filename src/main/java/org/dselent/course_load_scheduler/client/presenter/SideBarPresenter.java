package org.dselent.course_load_scheduler.client.presenter;

public interface SideBarPresenter extends BasePresenter{

	FacultyPresenter getParentPresenter();
	void setParentPresenter(FacultyPresenter parentPresenter);
	void openRequestScheduleChange();
	void openSchedule(String userName, String term);
}
