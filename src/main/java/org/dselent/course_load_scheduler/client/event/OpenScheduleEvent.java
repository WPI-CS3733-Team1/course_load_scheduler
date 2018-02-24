package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.event_handler.OpenScheduleEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenScheduleEvent extends DisplayEvent<OpenScheduleAction, OpenScheduleEventHandler>
{
	public static Type<OpenScheduleEventHandler> TYPE = new Type<OpenScheduleEventHandler>();
	
	private OpenScheduleAction action;
	
	public OpenScheduleEvent(OpenScheduleAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public OpenScheduleAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<OpenScheduleEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(OpenScheduleEventHandler handler)
	{
		handler.onOpenSchedule(this);
	}
}
