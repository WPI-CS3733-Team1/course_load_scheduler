package org.dselent.course_load_scheduler.client.presenter;

public interface SchedulePresenter extends BasePresenter {

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);	
	void presentSchedule();
	
}
