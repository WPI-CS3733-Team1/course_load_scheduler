package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.SendSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendSearchEvent extends DisplayEvent<SendSearchAction, SendSearchEventHandler>
{
	public static Type<SendSearchEventHandler> TYPE = new Type<SendSearchEventHandler>();
	
	public SendSearchEvent(SendSearchAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendSearchEventHandler handler)
	{
		handler.onSendSearch(this);
	}

}
