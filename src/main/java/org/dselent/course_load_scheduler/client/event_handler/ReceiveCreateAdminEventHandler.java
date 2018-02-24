package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCreateAdminEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCreateAdminEventHandler extends EventHandler {
	public void onReceiveCreateAdmin(ReceiveCreateAdminEvent evt);
}
