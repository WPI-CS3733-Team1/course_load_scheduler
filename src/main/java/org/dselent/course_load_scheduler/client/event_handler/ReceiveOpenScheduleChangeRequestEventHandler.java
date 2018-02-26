package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenScheduleChangeRequestEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveOpenScheduleChangeRequestEventHandler extends EventHandler
{
	  public void onReceiveOpenScheduleRequest(ReceiveOpenScheduleChangeRequestEvent evt);
}
