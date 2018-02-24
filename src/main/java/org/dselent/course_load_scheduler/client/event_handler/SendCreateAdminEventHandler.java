package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendCreateAdminEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendCreateAdminEventHandler extends EventHandler {
	public void onSendCreateAdmin(SendCreateAdminEvent evt);
}
