package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendConfirmScheduleAction;
import org.dselent.course_load_scheduler.client.event_handler.SendConfirmScheduleEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class SendConfirmScheduleEvent extends GwtEvent<SendConfirmScheduleEventHandler>{

	public static Type<SendConfirmScheduleEventHandler> TYPE = new Type<SendConfirmScheduleEventHandler>();
	
	private SendConfirmScheduleAction action;
	
	public SendConfirmScheduleEvent(SendConfirmScheduleAction action) {
		this.action = action;
	}
	
	public SendConfirmScheduleAction getAction() {
		return action;
	}
	
	@Override
	public Type<SendConfirmScheduleEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendConfirmScheduleEventHandler handler) {
		handler.onSendConfirmSchedule(this);
	}

}
