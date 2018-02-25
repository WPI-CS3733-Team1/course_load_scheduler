package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenInboxEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidOpenInboxEvent extends GwtEvent<InvalidOpenInboxEventHandler>
{
	public static Type<InvalidOpenInboxEventHandler> TYPE = new Type<InvalidOpenInboxEventHandler>();
	
	private InvalidOpenInboxAction action;
	
	public InvalidOpenInboxEvent(InvalidOpenInboxAction action)
	{
		this.action = action;
	}
	
	public InvalidOpenInboxAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidOpenInboxEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidOpenInboxEventHandler handler)
	{
		handler.onInvalidOpenInbox(this);
	}
}
