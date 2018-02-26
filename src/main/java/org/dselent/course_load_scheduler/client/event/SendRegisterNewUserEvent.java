package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.event_handler.SendRegisterNewUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendRegisterNewUserEvent extends DisplayEvent<SendRegisterNewUserAction, SendRegisterNewUserEventHandler>{
	
	public static Type<SendRegisterNewUserEventHandler> TYPE = new Type<SendRegisterNewUserEventHandler>();
	
	public SendRegisterNewUserEvent(SendRegisterNewUserAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendRegisterNewUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendRegisterNewUserEventHandler handler)
	{
		handler.onSendRegisterNewUser(this);
	}

}
