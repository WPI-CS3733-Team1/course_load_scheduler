package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCreateCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCreateCourseEvent extends DisplayEvent<ReceiveOpenCreateCourseAction, ReceiveCreateCourseEventHandler> {

		public static Type<ReceiveCreateCourseEventHandler> TYPE = new Type<ReceiveCreateCourseEventHandler>();

		public ReceiveCreateCourseEvent(ReceiveOpenCreateCourseAction action, HasWidgets container)
		{
			super(action, container);
		}
		
		@Override
		public Type<ReceiveCreateCourseEventHandler> getAssociatedType()
		{
			return TYPE;
		}
		
		@Override
		protected void dispatch(ReceiveCreateCourseEventHandler handler)
		{
			handler.onReceiveCreateCourse(this);
		}
}
