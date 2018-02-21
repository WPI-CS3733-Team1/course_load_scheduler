package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenInboxEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveOpenInboxEventHandler extends EventHandler
{
	  public void onReceiveOpenInbox(ReceiveOpenInboxEvent evt);
}
