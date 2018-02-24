package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenCreateAdminEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidOpenCreateAdminEvent extends GwtEvent<InvalidOpenCreateAdminEventHandler>
{
	public static Type<InvalidOpenCreateAdminEventHandler> TYPE = new Type<InvalidOpenCreateAdminEventHandler>();
	
	private InvalidOpenCreateAdminAction action;
	
	public InvalidOpenCreateAdminEvent(InvalidOpenCreateAdminAction action)
	{
		this.action = action;
	}
	
	public InvalidOpenCreateAdminAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidOpenCreateAdminEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidOpenCreateAdminEventHandler handler)
	{
		handler.onInvalidOpenCreateAdmin(this);
	}
}
