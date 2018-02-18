package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendCreateSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendCreateSectionEventHandler extends EventHandler {
	
	public void onSendCreateSection(SendCreateSectionEvent evt);

}
