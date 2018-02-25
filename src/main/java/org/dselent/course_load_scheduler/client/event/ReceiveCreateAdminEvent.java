package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCreateAdminAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCreateAdminEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCreateAdminEvent extends DisplayEvent<ReceiveCreateAdminAction, ReceiveCreateAdminEventHandler> {

	public static Type<ReceiveCreateAdminEventHandler> TYPE = new Type<ReceiveCreateAdminEventHandler>();
	
	private ReceiveCreateAdminAction action;
	
	public ReceiveCreateAdminEvent(ReceiveCreateAdminAction action, HasWidgets container) {
		super(action, container);
		this.action = action;
	}
	
	public ReceiveCreateAdminAction getAction() {
		return action;
	}

	@Override
	public Type<ReceiveCreateAdminEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCreateAdminEventHandler handler) {
		handler.onReceiveCreateAdmin(this);
		
	}
}
