package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.event_handler.SendOpenScheduleChangeRequestEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendOpenScheduleChangeRequestEvent extends DisplayEvent<SendOpenScheduleChangeRequestAction, SendOpenScheduleChangeRequestEventHandler>
{
	public static Type<SendOpenScheduleChangeRequestEventHandler> TYPE = new Type<SendOpenScheduleChangeRequestEventHandler>();
	
	public SendOpenScheduleChangeRequestEvent(SendOpenScheduleChangeRequestAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendOpenScheduleChangeRequestEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendOpenScheduleChangeRequestEventHandler handler)
	{
		handler.onSendOpenScheduleRequest(this);
	}
}
