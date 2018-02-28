package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveSidebarInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveSidebarInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveSidebarInfoEvent extends DisplayEvent<ReceiveSidebarInfoAction, ReceiveSidebarInfoEventHandler>{

	public static Type<ReceiveSidebarInfoEventHandler> TYPE = new Type<ReceiveSidebarInfoEventHandler>();
	
	public ReceiveSidebarInfoEvent(ReceiveSidebarInfoAction action, HasWidgets container) {
		super(action, container);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type<ReceiveSidebarInfoEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveSidebarInfoEventHandler handler) {
		handler.onReceiveSidebarInfo(this);
	}

}
