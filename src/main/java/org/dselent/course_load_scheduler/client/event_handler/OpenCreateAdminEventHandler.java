package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;

import com.google.gwt.event.shared.EventHandler;

public interface OpenCreateAdminEventHandler extends EventHandler
{
	  public void onOpenCreateAdmin(OpenCreateAdminEvent evt);
}
