package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveOpenScheduleRequestEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveOpenScheduleRequestEvent extends DisplayEvent<ReceiveOpenScheduleRequestAction, ReceiveOpenScheduleRequestEventHandler>
{
	public static Type<ReceiveOpenScheduleRequestEventHandler> TYPE = new Type<ReceiveOpenScheduleRequestEventHandler>();
	
	public ReceiveOpenScheduleRequestEvent(ReceiveOpenScheduleRequestAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveOpenScheduleRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveOpenScheduleRequestEventHandler handler)
	{
		handler.onReceiveOpenScheduleRequest(this);
	}
}
