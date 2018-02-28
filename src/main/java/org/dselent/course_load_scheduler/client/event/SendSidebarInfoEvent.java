package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendSidebarInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.SendSidebarInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendSidebarInfoEvent extends DisplayEvent<SendSidebarInfoAction, SendSidebarInfoEventHandler>{

	public static Type<SendSidebarInfoEventHandler> TYPE = new Type<SendSidebarInfoEventHandler>();
	
	public SendSidebarInfoEvent(SendSidebarInfoAction action, HasWidgets container) {
		super(action, container);
		
	}

	@Override
	public Type<SendSidebarInfoEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendSidebarInfoEventHandler handler) {
		handler.onSendSidebarInfo(this);
	}

}
