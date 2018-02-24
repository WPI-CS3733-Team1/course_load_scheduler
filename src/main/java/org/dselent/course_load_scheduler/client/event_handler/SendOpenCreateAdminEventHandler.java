package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendOpenCreateAdminEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendOpenCreateAdminEventHandler extends EventHandler
{
	  public void onSendOpenCreateAdmin(SendOpenCreateAdminEvent evt);
}
