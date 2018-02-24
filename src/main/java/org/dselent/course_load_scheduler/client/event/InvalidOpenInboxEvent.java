package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenInboxEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
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
