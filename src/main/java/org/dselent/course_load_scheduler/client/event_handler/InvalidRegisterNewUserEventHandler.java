package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidRegisterNewUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidRegisterNewUserEventHandler extends EventHandler{

	public void onInvalidRegisterNewUser(InvalidRegisterNewUserEvent evt);
}
