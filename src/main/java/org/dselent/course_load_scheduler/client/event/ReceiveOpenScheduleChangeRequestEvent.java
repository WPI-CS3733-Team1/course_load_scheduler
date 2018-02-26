package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveOpenScheduleChangeRequestEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveOpenScheduleChangeRequestEvent extends DisplayEvent<ReceiveOpenScheduleChangeRequestAction, ReceiveOpenScheduleChangeRequestEventHandler>
{
	public static Type<ReceiveOpenScheduleChangeRequestEventHandler> TYPE = new Type<ReceiveOpenScheduleChangeRequestEventHandler>();
	
	public ReceiveOpenScheduleChangeRequestEvent(ReceiveOpenScheduleChangeRequestAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveOpenScheduleChangeRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveOpenScheduleChangeRequestEventHandler handler)
	{
		handler.onReceiveOpenScheduleRequest(this);
	}
}
