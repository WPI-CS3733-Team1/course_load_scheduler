package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.event.InvalidOpenScheduleChangeRequestEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenScheduleChangeRequestEvent;
import org.dselent.course_load_scheduler.client.event_handler.SendOpenScheduleChangeRequestEventHandler;
import org.dselent.course_load_scheduler.client.translator.impl.OpenScheduleChangeRequestActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenScheduleChangeRequestCallback extends DisplayCallback<JSONValue>{

	public OpenScheduleChangeRequestCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		OpenScheduleChangeRequestActionTranslatorImpl t = new OpenScheduleChangeRequestActionTranslatorImpl();
		ReceiveOpenScheduleChangeRequestAction action = t.translateToAction(json);
		ReceiveOpenScheduleChangeRequestEvent event = new ReceiveOpenScheduleChangeRequestEvent(action, getContainer());
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
		
		InvalidOpenScheduleChangeRequestAction a = new InvalidOpenScheduleChangeRequestAction(sb.toString());
		InvalidOpenScheduleChangeRequestEvent e = new InvalidOpenScheduleChangeRequestEvent(a);
		
		
		eventBus.fireEvent(e);	
	}


}
