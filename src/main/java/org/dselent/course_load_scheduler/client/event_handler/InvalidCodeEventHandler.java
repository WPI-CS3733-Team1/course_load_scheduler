package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCodeEvent;
import org.dselent.course_load_scheduler.client.event.InvalidOpenInboxEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidCodeEventHandler extends EventHandler 
{
	public void onInvalidCode(InvalidCodeEvent evt);
}
