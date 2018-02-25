package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidMessageEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidMessageEvent extends GwtEvent<InvalidMessageEventHandler>
{
	public static Type<InvalidMessageEventHandler> TYPE = new Type<InvalidMessageEventHandler>();
	
	private InvalidMessageAction action;
	
	public InvalidMessageEvent(InvalidMessageAction action)
	{
		this.action = action;
	}
	
	public InvalidMessageAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidMessageEventHandler handler)
	{
		handler.onInvalidMessage(this);
	}
}
