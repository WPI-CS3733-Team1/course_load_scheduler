package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveSearchEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ReceiveSearchEventHandler extends EventHandler {

	void onReceiveSearch(ReceiveSearchEvent receiveSearchEvent);
	
}
