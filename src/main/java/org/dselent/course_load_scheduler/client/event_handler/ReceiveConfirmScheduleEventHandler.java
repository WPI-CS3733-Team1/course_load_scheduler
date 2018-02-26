package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveConfirmScheduleEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveConfirmScheduleEventHandler extends EventHandler {
	public void onReceiveConfirmSchedule(ReceiveConfirmScheduleEvent evt);
}
