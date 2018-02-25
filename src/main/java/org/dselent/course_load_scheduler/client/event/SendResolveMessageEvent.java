package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendResolveMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.SendResolveMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendResolveMessageEvent extends DisplayEvent<SendResolveMessageAction, SendResolveMessageEventHandler>
{
	public static Type<SendResolveMessageEventHandler> TYPE = new Type<SendResolveMessageEventHandler>();
	
	public SendResolveMessageEvent(SendResolveMessageAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendResolveMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendResolveMessageEventHandler handler)
	{
		handler.onSendResolveMessage(this);
	}
}
