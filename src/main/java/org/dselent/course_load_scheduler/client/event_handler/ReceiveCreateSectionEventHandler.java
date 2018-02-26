package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCreateSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCreateSectionEventHandler extends EventHandler{
	
	public void onReceiveCreateSection(ReceiveCreateSectionEvent evt);

}
