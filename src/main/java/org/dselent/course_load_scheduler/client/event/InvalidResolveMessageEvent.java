package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidResolveMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidResolveMessageEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidResolveMessageEvent extends GwtEvent<InvalidResolveMessageEventHandler>
{
	public static Type<InvalidResolveMessageEventHandler> TYPE = new Type<InvalidResolveMessageEventHandler>();
	
	private InvalidResolveMessageAction action;
	
	public InvalidResolveMessageEvent(InvalidResolveMessageAction action)
	{
		this.action = action;
	}
	
	public InvalidResolveMessageAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidResolveMessageEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidResolveMessageEventHandler handler)
	{
		handler.onInvalidResolveMessage(this);
	}
}
