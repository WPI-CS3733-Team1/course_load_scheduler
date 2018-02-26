package org.dselent.course_load_scheduler.client.presenter;

import java.util.HashMap;
import java.util.List;

public interface SchedulePresenter extends BasePresenter {

	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
	
	void presentSchedule(List<HashMap<String, String>> sections);
	
}
