package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendConfirmScheduleEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendConfirmScheduleEventHandler extends EventHandler {
	public void onSendConfirmSchedule(SendConfirmScheduleEvent evt);
}
