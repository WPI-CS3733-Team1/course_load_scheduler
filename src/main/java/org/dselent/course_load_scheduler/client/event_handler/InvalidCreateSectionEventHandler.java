package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCreateSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidCreateSectionEventHandler extends EventHandler {
	public void onInvalidCreateSection(InvalidCreateSectionEvent evt);

}
