package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCreateCourseEventHandler;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCreateSectionEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCreateSectionEvent extends DisplayEvent<ReceiveOpenCreateSectionAction, ReceiveCreateSectionEventHandler> {
	



			public static Type<ReceiveCreateSectionEventHandler> TYPE = new Type<ReceiveCreateSectionEventHandler>();

			public ReceiveCreateSectionEvent(ReceiveOpenCreateSectionAction action, HasWidgets container)
			{
				super(action, container);
			}
			
			@Override
			public Type<ReceiveCreateSectionEventHandler> getAssociatedType()
			{
				return TYPE;
			}
			
			@Override
			protected void dispatch(ReceiveCreateSectionEventHandler handler)
			{
				handler.onReceiveCreateSection(this);
			}
	}
