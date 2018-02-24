package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenCreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenCreateSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class OpenCreateSectionEvent extends GwtEvent<OpenCreateSectionEventHandler>
{
	public static Type<OpenCreateSectionEventHandler> TYPE = new Type<OpenCreateSectionEventHandler>();
	
	private OpenCreateSectionAction action;
	
	public OpenCreateSectionEvent(OpenCreateSectionAction action)
	{
		this.action = action;
	}
	
	public OpenCreateSectionAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenCreateSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenCreateSectionEventHandler handler)
	{
		handler.onOpenCreateSection(this);
	}
}
