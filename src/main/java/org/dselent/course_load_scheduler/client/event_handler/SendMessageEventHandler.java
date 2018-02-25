package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendMessageEventHandler extends EventHandler
{
	  public void onSendMessage(SendMessageEvent evt);
}
