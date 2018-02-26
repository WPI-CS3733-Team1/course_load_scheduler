package org.dselent.course_load_scheduler.client.event_handler;


import org.dselent.course_load_scheduler.client.event.SendRegisterNewUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendRegisterNewUserEventHandler extends EventHandler {
	
	public void onSendRegisterNewUser(SendRegisterNewUserEvent evt);

}
