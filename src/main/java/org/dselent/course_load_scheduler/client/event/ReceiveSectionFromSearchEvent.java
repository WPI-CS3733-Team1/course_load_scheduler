package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.action.ReceiveSectionFromSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveScheduleEventHandler;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveSectionFromSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveSectionFromSearchEvent extends DisplayEvent<ReceiveSectionFromSearchAction, ReceiveSectionFromSearchEventHandler>{
	
	public static Type<ReceiveSectionFromSearchEventHandler> TYPE = new Type<ReceiveSectionFromSearchEventHandler>();

	public ReceiveSectionFromSearchEvent(ReceiveSectionFromSearchAction action, HasWidgets container) {
		super(action, container);
	}
	
	@Override
	public Type<ReceiveSectionFromSearchEventHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
	protected void dispatch(ReceiveSectionFromSearchEventHandler handler) {
		handler.onReceiveSectionFromSearch(this);
	}

}
