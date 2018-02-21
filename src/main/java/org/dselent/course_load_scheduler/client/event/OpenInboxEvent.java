package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenInboxEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenInboxEvent extends DisplayEvent<OpenInboxAction, OpenInboxEventHandler>
{
	public static Type<OpenInboxEventHandler> TYPE = new Type<OpenInboxEventHandler>();
	
	private OpenInboxAction action;
	
	public OpenInboxEvent(OpenInboxAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public OpenInboxAction getAction()
	{
		return action;
	}
	
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
