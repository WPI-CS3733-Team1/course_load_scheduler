package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenScheduleChangeRequestEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events are "fired" and sent on the event bus to be sent to an applicable event handler
 * This event is for processing an invalid login
 * 
 * @author dselent
 *
 */
public class InvalidOpenScheduleChangeRequestEvent extends GwtEvent<InvalidOpenScheduleChangeRequestEventHandler>
{
	public static Type<InvalidOpenScheduleChangeRequestEventHandler> TYPE = new Type<InvalidOpenScheduleChangeRequestEventHandler>();
	
	private InvalidOpenScheduleChangeRequestAction action;
	
	public InvalidOpenScheduleChangeRequestEvent(InvalidOpenScheduleChangeRequestAction action)
	{
		this.action = action;
	}
	
	public InvalidOpenScheduleChangeRequestAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<InvalidOpenScheduleChangeRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(InvalidOpenScheduleChangeRequestEventHandler handler)
	{
		handler.onInvalidOpenScheduleRequest(this);
	}
}
