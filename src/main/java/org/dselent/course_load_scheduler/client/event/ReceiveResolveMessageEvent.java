package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveResolveMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveResolveMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveResolveMessageEvent extends DisplayEvent<ReceiveResolveMessageAction, ReceiveResolveMessageEventHandler>
{
	public static Type<ReceiveResolveMessageEventHandler> TYPE = new Type<ReceiveResolveMessageEventHandler>();
	
	public ReceiveResolveMessageEvent(ReceiveResolveMessageAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveResolveMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveResolveMessageEventHandler handler)
	{
		handler.onReceiveResolveMessage(this);
	}
}
