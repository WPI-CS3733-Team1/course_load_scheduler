package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.SendOpenScheduleChangeRequestEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendOpenScheduleChangeRequestEventHandler extends EventHandler
{
	  public void onSendOpenScheduleRequest(SendOpenScheduleChangeRequestEvent evt);
}
