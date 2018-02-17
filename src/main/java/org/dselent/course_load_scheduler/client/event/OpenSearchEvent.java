package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenSearchEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class OpenSearchEvent extends GwtEvent<OpenSearchEventHandler>
{
	public static Type<OpenSearchEventHandler> TYPE = new Type<OpenSearchEventHandler>();
	
	private OpenSearchAction action;
	
	public OpenSearchEvent(OpenSearchAction action)
	{
		this.action = action;
	}
	
	public OpenSearchAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenSearchEventHandler handler)
	{
		handler.onOpenSearch(this);
	}
}
