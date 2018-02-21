package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendOpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.SendOpenInboxEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendOpenInboxEvent extends DisplayEvent<SendOpenInboxAction, SendOpenInboxEventHandler>
{
	public static Type<SendOpenInboxEventHandler> TYPE = new Type<SendOpenInboxEventHandler>();
	
	public SendOpenInboxEvent(SendOpenInboxAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendOpenInboxEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendOpenInboxEventHandler handler)
	{
		handler.onSendOpenInbox(this);
	}
}
