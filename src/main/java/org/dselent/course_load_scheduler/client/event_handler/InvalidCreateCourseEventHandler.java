package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCreateCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidCreateCourseEventHandler extends EventHandler
{
	public void onInvalidCreateCourse(InvalidCreateCourseEvent evt);

}
