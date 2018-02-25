package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.SendMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendMessageEvent extends DisplayEvent<SendMessageAction, SendMessageEventHandler>
{
	public static Type<SendMessageEventHandler> TYPE = new Type<SendMessageEventHandler>();
	
	public SendMessageEvent(SendMessageAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendMessageEventHandler handler)
	{
		handler.onSendMessage(this);
	}
}
