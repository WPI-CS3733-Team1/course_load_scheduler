package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveRegisterNewUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveRegisterNewUserEventHandler extends EventHandler{
	
	public void onReceiveRegisterNewUser(ReceiveRegisterNewUserEvent evt);

}
