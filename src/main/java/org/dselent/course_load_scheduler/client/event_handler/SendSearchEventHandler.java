package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendSearchEventHandler extends EventHandler {

	void onSendSearch(SendSearchEvent sendSearchEvent);

}
