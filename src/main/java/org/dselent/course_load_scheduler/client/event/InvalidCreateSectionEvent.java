package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidCreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidCreateSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidCreateSectionEvent extends GwtEvent<InvalidCreateSectionEventHandler> {
	
	public static Type<InvalidCreateSectionEventHandler> TYPE = new Type<InvalidCreateSectionEventHandler>();
	
	private InvalidCreateSectionAction action;
	
	public InvalidCreateSectionEvent(InvalidCreateSectionAction action)
	{
		this.action = action;
	}
	@Override
	public Type<InvalidCreateSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	
	@Override
	protected void dispatch(InvalidCreateSectionEventHandler handler)
	{
		handler.onInvalidCreateSection(this);
	}

}
