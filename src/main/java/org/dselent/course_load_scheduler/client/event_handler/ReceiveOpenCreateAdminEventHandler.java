package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenCreateAdminEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveOpenCreateAdminEventHandler extends EventHandler
{
	  public void onReceiveOpenCreateAdmin(ReceiveOpenCreateAdminEvent evt);
}
