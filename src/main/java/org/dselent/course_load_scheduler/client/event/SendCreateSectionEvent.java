package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendCreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCreateSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class SendCreateSectionEvent extends GwtEvent<SendCreateSectionEventHandler> {
	public static Type<SendCreateSectionEventHandler> TYPE = new Type<SendCreateSectionEventHandler>();
	
	private SendCreateSectionAction action;
	
	public SendCreateSectionEvent(SendCreateSectionAction action)
	{
		this.action = action;
	}
	
	public SendCreateSectionAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<SendCreateSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	
	@Override
	protected void dispatch(SendCreateSectionEventHandler handler)
	{
		handler.onSendCreateSection(this);
	}
}
