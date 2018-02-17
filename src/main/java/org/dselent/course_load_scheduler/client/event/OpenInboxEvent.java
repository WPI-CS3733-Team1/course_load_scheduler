package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenInboxEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class OpenInboxEvent extends GwtEvent<OpenInboxEventHandler>
{
	public static Type<OpenInboxEventHandler> TYPE = new Type<OpenInboxEventHandler>();
	
	private OpenInboxAction action;
	
	public OpenInboxEvent(OpenInboxAction action)
	{
		this.action = action;
	}
	
	public OpenInboxAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenInboxEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenInboxEventHandler handler)
	{
		handler.onOpenInbox(this);
	}
}
