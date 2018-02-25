package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveMessageEventHandler extends EventHandler
{
	  public void onReceiveMessage(ReceiveMessageEvent evt);
}
