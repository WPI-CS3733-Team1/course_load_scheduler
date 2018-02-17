package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;

import com.google.gwt.event.shared.EventHandler;

public interface OpenScheduleEventHandler extends EventHandler
{
	  public void onOpenSchedule(OpenScheduleEvent evt);
}
