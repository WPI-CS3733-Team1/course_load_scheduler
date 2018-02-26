package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveRegisterNewUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveRegisterNewUserEvent extends DisplayEvent<ReceiveRegisterNewUserAction, ReceiveRegisterNewUserEventHandler> {
	
public static Type<ReceiveRegisterNewUserEventHandler> TYPE = new Type<ReceiveRegisterNewUserEventHandler>();
	
	public ReceiveRegisterNewUserEvent(ReceiveRegisterNewUserAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveRegisterNewUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveRegisterNewUserEventHandler handler)
	{
		handler.onReceiveRegisterNewUser(this);
	}

}
