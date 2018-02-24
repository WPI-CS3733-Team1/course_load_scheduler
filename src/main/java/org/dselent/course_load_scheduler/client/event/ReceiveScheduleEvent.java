package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveScheduleEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveScheduleEvent extends DisplayEvent<ReceiveScheduleAction, ReceiveScheduleEventHandler>{
	
	public static Type<ReceiveScheduleEventHandler> TYPE = new Type<ReceiveScheduleEventHandler>();

	public ReceiveScheduleEvent(ReceiveScheduleAction action, HasWidgets container) {
		super(action, container);
	}
	
	@Override
	public Type<ReceiveScheduleEventHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
	protected void dispatch(ReceiveScheduleEventHandler handler) {
		handler.onReceiveSchedule(this);
	}

}
