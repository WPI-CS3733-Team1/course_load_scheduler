package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidOpenScheduleEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidOpenScheduleEventHandler extends EventHandler {
	public void onInvalidOpenSchedule(InvalidOpenScheduleEvent evt);
}
