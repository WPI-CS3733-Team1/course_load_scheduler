package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveOpenCreateAdminEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveOpenCreateAdminEvent extends DisplayEvent<ReceiveOpenCreateAdminAction, ReceiveOpenCreateAdminEventHandler>
{
	public static Type<ReceiveOpenCreateAdminEventHandler> TYPE = new Type<ReceiveOpenCreateAdminEventHandler>();
	
	public ReceiveOpenCreateAdminEvent(ReceiveOpenCreateAdminAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveOpenCreateAdminEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveOpenCreateAdminEventHandler handler)
	{
		handler.onReceiveOpenCreateAdmin(this);
	}
}
