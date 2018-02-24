package org.dselent.course_load_scheduler.client.action;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.model.CompleteSection;
import org.dselent.course_load_scheduler.client.model.Section;

public class ReceiveScheduleAction extends Action { 
	
	List<Section> schedule;
	
	public ReceiveScheduleAction(ArrayList<Section> schedule) {
		this.schedule = schedule;
	}
	
	public List<Section> getSchedule() {
		return schedule;
	}
	
	public void setModel(List<Section> schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "ReceiveScheduleAction [schedule=" + schedule + "]";
	}
	
	
}
