package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendResolveMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendResolveMessageEventHandler extends EventHandler
{
	  public void onSendResolveMessage(SendResolveMessageEvent evt);
}
