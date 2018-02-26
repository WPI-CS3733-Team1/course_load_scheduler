package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.InvalidRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.ReceiveRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.event.InvalidOpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.InvalidRegisterNewUserEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveRegisterNewUserEvent;
import org.dselent.course_load_scheduler.client.translator.impl.OpenInboxActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.RegisterNewUserTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class RegisterNewUserCallback extends DisplayCallback<JSONValue>{
	
	public RegisterNewUserCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}

	@Override
	public void onFailure(Throwable caught) {
		
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		InvalidRegisterNewUserAction irnua = new InvalidRegisterNewUserAction(sb.toString());
		InvalidRegisterNewUserEvent irnue = new InvalidRegisterNewUserEvent(irnua);
		eventBus.fireEvent(irnue);
		
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		RegisterNewUserTranslatorImpl registerNewUserTranslator = new RegisterNewUserTranslatorImpl();
		ReceiveRegisterNewUserAction action = registerNewUserTranslator.translateToAction(json);
		
		ReceiveRegisterNewUserEvent event = new ReceiveRegisterNewUserEvent(action, getContainer());
		eventBus.fireEvent(event);
		
	}
	
	
	
	

}
