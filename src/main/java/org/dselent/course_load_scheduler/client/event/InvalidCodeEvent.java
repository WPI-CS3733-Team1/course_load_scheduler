package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidCodeAction;
import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidCodeEventHandler;
import org.dselent.course_load_scheduler.client.event_handler.InvalidOpenInboxEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class InvalidCodeEvent extends GwtEvent<InvalidCodeEventHandler>
{
public static Type<InvalidCodeEventHandler> TYPE = new Type<InvalidCodeEventHandler>();
	
	private InvalidCodeAction action;

	@Override
	protected void dispatch(InvalidCodeEventHandler handler) {
		handler.onInvalidCode(this);
	}
	
	public InvalidCodeEvent(InvalidCodeAction action)
	{
		this.action = action;
	}
	
	public InvalidCodeAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<InvalidCodeEventHandler> getAssociatedType()
	{
		return TYPE;
	}

}
