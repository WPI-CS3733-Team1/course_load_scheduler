package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveSidebarInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveSidebarInfoEventHandler extends EventHandler {

	public void onReceiveSidebarInfo(ReceiveSidebarInfoEvent evt);
	
}
