package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendOpenScheduleRequestEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendOpenScheduleRequestEventHandler extends EventHandler
{
	  public void onSendOpenScheduleRequest(SendOpenScheduleRequestEvent evt);
}
