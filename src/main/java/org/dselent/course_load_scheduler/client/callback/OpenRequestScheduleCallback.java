package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.event.InvalidOpenScheduleRequestEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenScheduleRequestEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenScheduleRequestEvent;
import org.dselent.course_load_scheduler.client.translator.impl.OpenScheduleActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.OpenScheduleRequestActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenRequestScheduleCallback extends DisplayCallback<JSONValue>{

	public OpenRequestScheduleCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		OpenScheduleRequestActionTranslatorImpl t = new OpenScheduleRequestActionTranslatorImpl();
		ReceiveOpenScheduleRequestAction action = t.translateToAction(json);
		
		ReceiveOpenScheduleRequestEvent event = new ReceiveOpenScheduleRequestEvent(action, getContainer());
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
		
		InvalidOpenScheduleRequestAction a = new InvalidOpenScheduleRequestAction(sb.toString());
		InvalidOpenScheduleRequestEvent e = new InvalidOpenScheduleRequestEvent(a);
		
		
		eventBus.fireEvent(e);	
	}
}
