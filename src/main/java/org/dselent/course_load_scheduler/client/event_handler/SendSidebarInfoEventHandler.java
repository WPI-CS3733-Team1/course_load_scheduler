package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendSidebarInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendSidebarInfoEventHandler extends EventHandler {
	
	public void onSendSidebarInfo(SendSidebarInfoEvent evt);
	
}
