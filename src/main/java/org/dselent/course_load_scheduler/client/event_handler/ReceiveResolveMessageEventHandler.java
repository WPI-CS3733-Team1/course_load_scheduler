package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveResolveMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveResolveMessageEventHandler extends EventHandler
{
	  public void onReceiveResolveMessage(ReceiveResolveMessageEvent evt);
}
