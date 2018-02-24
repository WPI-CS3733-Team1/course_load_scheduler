package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveScheduleEventHandler extends EventHandler {
	
	public void onReceiveSchedule(ReceiveScheduleEvent evt);
	
}
