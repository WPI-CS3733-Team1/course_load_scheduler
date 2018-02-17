package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenCreateAdminEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class OpenCreateAdminEvent extends GwtEvent<OpenCreateAdminEventHandler>
{
	public static Type<OpenCreateAdminEventHandler> TYPE = new Type<OpenCreateAdminEventHandler>();
	
	private OpenCreateAdminAction action;
	
	public OpenCreateAdminEvent(OpenCreateAdminAction action)
	{
		this.action = action;
	}
	
	public OpenCreateAdminAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenCreateAdminEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenCreateAdminEventHandler handler)
	{
		handler.onOpenCreateAdmin(this);
	}
}
