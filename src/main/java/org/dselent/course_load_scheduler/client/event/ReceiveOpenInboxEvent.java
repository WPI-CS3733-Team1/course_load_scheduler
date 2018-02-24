package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveOpenInboxEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveOpenInboxEvent extends DisplayEvent<ReceiveOpenInboxAction, ReceiveOpenInboxEventHandler>
{
	public static Type<ReceiveOpenInboxEventHandler> TYPE = new Type<ReceiveOpenInboxEventHandler>();
	
	public ReceiveOpenInboxEvent(ReceiveOpenInboxAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveOpenInboxEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveOpenInboxEventHandler handler)
	{
		handler.onReceiveOpenInbox(this);
	}
}
