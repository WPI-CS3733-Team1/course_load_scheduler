package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenCreateCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class OpenCreateCourseEvent extends GwtEvent<OpenCreateCourseEventHandler>
{
	public static Type<OpenCreateCourseEventHandler> TYPE = new Type<OpenCreateCourseEventHandler>();
	
	private OpenCreateCourseAction action;
	
	public OpenCreateCourseEvent(OpenCreateCourseAction action)
	{
		this.action = action;
	}
	
	public OpenCreateCourseAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenCreateCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenCreateCourseEventHandler handler)
	{
		handler.onOpenCreateCourse(this);
	}
}
