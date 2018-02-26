package org.dselent.course_load_scheduler.client.presenter;

public interface SideBarPresenter extends BasePresenter{

	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
	void openRequestScheduleChange();
	void openSchedule(String userName, String term);
}
