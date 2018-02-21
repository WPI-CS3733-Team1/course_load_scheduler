package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event.InvalidOpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.translator.impl.OpenCreateAdminActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenCreateAdminCallback extends DisplayCallback<JSONValue>
{
	public OpenCreateAdminCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		OpenCreateAdminActionTranslatorImpl openCreateAdminActionTranslator = new OpenCreateAdminActionTranslatorImpl();
		ReceiveOpenCreateAdminAction action = openCreateAdminActionTranslator.translateToAction(json);
		
		ReceiveOpenCreateAdminEvent event = new ReceiveOpenCreateAdminEvent(action, getContainer());
		eventBus.fireEvent(event);
	}
	  
	@Override
	public void onFailure(Throwable caught)
	{
		// TODO
		// give better exception information
		// these stack traces are not helpful
		
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		InvalidOpenCreateAdminAction iocaa = new InvalidOpenCreateAdminAction(sb.toString());
		InvalidOpenCreateAdminEvent iocae = new InvalidOpenCreateAdminEvent(iocaa);
		eventBus.fireEvent(iocae);
	}

  }