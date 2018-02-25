package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenScheduleRequestEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidOpenScheduleRequestEvent extends GwtEvent<InvalidOpenScheduleRequestEventHandler>
{
	public static Type<InvalidOpenScheduleRequestEventHandler> TYPE = new Type<InvalidOpenScheduleRequestEventHandler>();
	
	private InvalidOpenScheduleRequestAction action;
	
	public InvalidOpenScheduleRequestEvent(InvalidOpenScheduleRequestAction action)
	{
		this.action = action;
	}
	
	public InvalidOpenScheduleRequestAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidOpenScheduleRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidOpenScheduleRequestEventHandler handler)
	{
		handler.onInvalidOpenScheduleRequest(this);
	}
}
