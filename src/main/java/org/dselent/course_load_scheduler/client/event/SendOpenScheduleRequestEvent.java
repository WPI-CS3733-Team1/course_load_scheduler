package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.SendOpenScheduleRequestEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendOpenScheduleRequestEvent extends DisplayEvent<SendOpenScheduleRequestAction, SendOpenScheduleRequestEventHandler>
{
	public static Type<SendOpenScheduleRequestEventHandler> TYPE = new Type<SendOpenScheduleRequestEventHandler>();
	
	public SendOpenScheduleRequestEvent(SendOpenScheduleRequestAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendOpenScheduleRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendOpenScheduleRequestEventHandler handler)
	{
		handler.onSendOpenScheduleRequest(this);
	}
}
