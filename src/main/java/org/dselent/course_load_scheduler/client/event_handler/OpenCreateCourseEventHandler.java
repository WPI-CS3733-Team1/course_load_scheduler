package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.OpenCreateCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface OpenCreateCourseEventHandler extends EventHandler
{
	  public void onOpenCreateCourse(OpenCreateCourseEvent evt);
}
