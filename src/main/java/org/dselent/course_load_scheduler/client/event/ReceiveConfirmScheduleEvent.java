package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveConfirmScheduleAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveConfirmScheduleEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveConfirmScheduleEvent extends DisplayEvent<ReceiveConfirmScheduleAction, ReceiveConfirmScheduleEventHandler> {
	
	public static Type<ReceiveConfirmScheduleEventHandler> TYPE = new Type<ReceiveConfirmScheduleEventHandler>();
	
	private ReceiveConfirmScheduleAction action;

	public ReceiveConfirmScheduleEvent(ReceiveConfirmScheduleAction action, HasWidgets container) {
		super(action, container);
		this.action = action;
	}
	
	public ReceiveConfirmScheduleAction getAction() {
		return action;
	}
	
	@Override
	public Type<ReceiveConfirmScheduleEventHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
	protected void dispatch(ReceiveConfirmScheduleEventHandler handler) {
		handler.onReceiveConfirmSchedule(this);
	}
}
