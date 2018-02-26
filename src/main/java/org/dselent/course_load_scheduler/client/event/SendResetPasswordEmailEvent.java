package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendResetPasswordEmailAction;
import org.dselent.course_load_scheduler.client.event_handler.SendResetPasswordEmailEventHandler;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendResetPasswordEmailEvent extends DisplayEvent<ResetPasswordEmailAction, ResetPasswordEmailEventHandler> {
public static Type<SendResetPasswordEmailEventHandler> TYPE = new Type<SendResetPasswordEmailEventHandler>();
	
	public SendResetPasswordEmailEvent(SendResetPasswordEmailAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	@Override
	public Type<SendResetPasswordEmailEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(SendResetPasswordEmailEventHandler handler)
	{
		handler.onSendResetPasswordEmail(this);
	}


}
