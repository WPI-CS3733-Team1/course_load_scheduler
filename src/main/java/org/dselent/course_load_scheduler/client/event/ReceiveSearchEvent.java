package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveSearchEventHandler;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveSearchEvent extends DisplayEvent<ReceiveSearchAction, ReceiveSearchEventHandler>
{
	public static Type<ReceiveSearchEventHandler> TYPE = new Type<ReceiveSearchEventHandler>();
	
	public ReceiveSearchEvent(ReceiveSearchAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<ReceiveSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveSearchEventHandler handler)
	{
		handler.onReceiveSearch(this);
	}

}
