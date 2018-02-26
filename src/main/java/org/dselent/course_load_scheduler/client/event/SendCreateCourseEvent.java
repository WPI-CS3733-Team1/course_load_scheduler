package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCreateCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendCreateCourseEvent extends DisplayEvent<SendCreateCourseAction, SendCreateCourseEventHandler> 
{

	public static Type<SendCreateCourseEventHandler> TYPE = new Type<SendCreateCourseEventHandler>();
	
	private SendCreateCourseAction action;
	
	public SendCreateCourseEvent(SendCreateCourseAction action, HasWidgets container)
	{
		super(action, container);
		}
	
	public SendCreateCourseAction getAction()
	{
		return action;
	}

	@Override
	public Type<SendCreateCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	
	@Override
	protected void dispatch(SendCreateCourseEventHandler handler)
	{
		handler.onSendCreateCourse(this);
	}

}
