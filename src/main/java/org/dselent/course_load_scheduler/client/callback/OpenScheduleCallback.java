package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.InvalidOpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.OpenScheduleActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenScheduleCallback extends DisplayCallback<JSONValue>{

	public OpenScheduleCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		OpenScheduleActionTranslatorImpl t = new OpenScheduleActionTranslatorImpl();
		ReceiveScheduleAction action = t.translateToAction(json);
		
		ReceiveScheduleEvent event = new ReceiveScheduleEvent(action, getContainer());
		eventBus.fireEvent(event);
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
		
		InvalidOpenScheduleAction a = new InvalidOpenScheduleAction(sb.toString());
		InvalidOpenScheduleEvent e = new InvalidOpenScheduleEvent(a);
		
		
		eventBus.fireEvent(e);	
	}
}
