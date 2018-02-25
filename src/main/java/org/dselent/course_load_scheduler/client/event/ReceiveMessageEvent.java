package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveMessageEvent extends DisplayEvent<ReceiveMessageAction, ReceiveMessageEventHandler>
{
	public static Type<ReceiveMessageEventHandler> TYPE = new Type<ReceiveMessageEventHandler>();
	
	public ReceiveMessageEvent(ReceiveMessageAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveMessageEventHandler handler)
	{
		handler.onReceiveMessage(this);
	}
}
