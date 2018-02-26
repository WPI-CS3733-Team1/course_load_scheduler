package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveSectionFromSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveSectionFromSearchEventHandler extends EventHandler {
	
	public void onReceiveSectionFromSearch(ReceiveSectionFromSearchEvent evt);
	
}
