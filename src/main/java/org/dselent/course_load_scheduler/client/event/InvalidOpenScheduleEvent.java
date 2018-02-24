package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenScheduleEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidOpenScheduleEvent extends GwtEvent<InvalidOpenScheduleEventHandler>{

	public static Type<InvalidOpenScheduleEventHandler> TYPE = new Type<InvalidOpenScheduleEventHandler>();
	
	private InvalidOpenScheduleAction action;
	
	public InvalidOpenScheduleEvent(InvalidOpenScheduleAction a) {
		this.action = a;
	}
	
	
	@Override
	public Type<InvalidOpenScheduleEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidOpenScheduleEventHandler handler) {
		handler.onInvalidOpenSchedule(this);
	}

}
