package org.dselent.course_load_scheduler.client.view;

import java.util.HashMap;

import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.InlineLabel;

public interface ScheduleView extends BaseView<SchedulePresenter>{
	//get all labels?
	HashMap<String, InlineLabel> getMondaySchedule();
	
	HashMap<String, InlineLabel> getTuesdaySchedule();
	
	HashMap<String, InlineLabel> getWednesdaySchedule();
	
	HashMap<String, InlineLabel> getThursdaySchedule();
	
	HashMap<String, InlineLabel> getFridaySchedule();
	
	SchedulePresenter getPresenter();
	/* don't think I actually need these
	void setMondaySchedule(HashMap<String, InlineLabel> newSchedule);
	void setTuesdaySchedule(HashMap<String, InlineLabel> newSchedule);
	void setWednesdaySchedule(HashMap<String, InlineLabel> newSchedule);
	void setThursdaySchedule(HashMap<String, InlineLabel> newSchedule);
	void setFridaySchedule(HashMap<String, InlineLabel> newSchedule);
	*/
}
