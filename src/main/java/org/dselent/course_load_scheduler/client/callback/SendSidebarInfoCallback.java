package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveSidebarInfoAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveSidebarInfoEvent;
import org.dselent.course_load_scheduler.client.translator.impl.SidebarInfoTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendSidebarInfoCallback extends DisplayCallback<JSONValue>{

	public SendSidebarInfoCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		SidebarInfoTranslatorImpl t = new SidebarInfoTranslatorImpl();
		ReceiveSidebarInfoAction action = t.translateToAction(json);
		
		ReceiveSidebarInfoEvent event = new ReceiveSidebarInfoEvent(action, getContainer());
		eventBus.fireEvent(event);
	}
	
	@Override
	public void onFailure(Throwable caught) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		InvalidLoginAction ila = new InvalidLoginAction(sb.toString()); //fix this later maybe.
		InvalidLoginEvent ile = new InvalidLoginEvent(ila);
		eventBus.fireEvent(ile);
	}

	

}
