package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenScheduleRequestEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveOpenScheduleRequestEventHandler extends EventHandler
{
	  public void onReceiveOpenScheduleRequest(ReceiveOpenScheduleRequestEvent evt);
}
