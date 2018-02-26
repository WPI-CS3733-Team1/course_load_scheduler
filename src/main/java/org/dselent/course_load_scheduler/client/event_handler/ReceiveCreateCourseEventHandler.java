package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCreateCourseEventHandler extends EventHandler {


	  public void onReceiveCreateCourse(ReceiveCreateCourseEvent evt);

}
