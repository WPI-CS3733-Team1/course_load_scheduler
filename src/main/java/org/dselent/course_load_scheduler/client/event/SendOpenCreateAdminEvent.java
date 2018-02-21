package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event_handler.SendOpenCreateAdminEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendOpenCreateAdminEvent extends DisplayEvent<SendOpenCreateAdminAction, SendOpenCreateAdminEventHandler>
{
	public static Type<SendOpenCreateAdminEventHandler> TYPE = new Type<SendOpenCreateAdminEventHandler>();
	
	public SendOpenCreateAdminEvent(SendOpenCreateAdminAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendOpenCreateAdminEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendOpenCreateAdminEventHandler handler)
	{
		handler.onSendOpenCreateAdmin(this);
	}
}
