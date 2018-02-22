package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendCreateAdminAction;
import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCreateAdminEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class SendCreateAdminEvent extends GwtEvent<SendCreateAdminEventHandler> {

	public static Type<SendCreateAdminEventHandler> TYPE = new Type<SendCreateAdminEventHandler>();
	
	private SendCreateAdminAction action;
	
	public SendCreateAdminEvent(SendCreateAdminAction action) {
		this.action = action;
	}
	
	public SendCreateAdminAction getAction() {
		return action;
	}
	
	@Override
	public Type<SendCreateAdminEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendCreateAdminEventHandler handler) {
		handler.onSendCreateAdmin(this);
	}

}
