package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidRegisterNewUserEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidRegisterNewUserEvent extends GwtEvent<InvalidRegisterNewUserEventHandler>{
	
public static Type<InvalidRegisterNewUserEventHandler> TYPE = new Type<InvalidRegisterNewUserEventHandler>();
	
	private InvalidRegisterNewUserAction action;
	
	public InvalidRegisterNewUserEvent(InvalidRegisterNewUserAction action)
	{
		this.action = action;
	}
	
	public InvalidRegisterNewUserAction getAction()
	{
		return action;
	}

	@Override
	public Type<InvalidRegisterNewUserEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidRegisterNewUserEventHandler handler) {
		handler.onInvalidRegisterNewUser(this);
		
	}
	
	

}
