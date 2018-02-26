package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.SendCreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCreateSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendCreateSectionEvent extends DisplayEvent<SendCreateSectionAction, SendCreateSectionEventHandler> {
	public static Type<SendCreateSectionEventHandler> TYPE = new Type<SendCreateSectionEventHandler>();
	
	public SendCreateSectionEvent(SendCreateSectionAction action, HasWidgets container)
	{
		super(action, container);
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
