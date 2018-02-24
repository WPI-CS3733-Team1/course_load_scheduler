package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenInboxAction;
import org.dselent.course_load_scheduler.client.event.InvalidOpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveOpenInboxEvent;
import org.dselent.course_load_scheduler.client.translator.impl.OpenInboxActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class OpenInboxCallback extends DisplayCallback<JSONValue>
{
	public OpenInboxCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		OpenInboxActionTranslatorImpl loginActionTranslator = new OpenInboxActionTranslatorImpl();
		ReceiveOpenInboxAction action = loginActionTranslator.translateToAction(json);
		
		ReceiveOpenInboxEvent event = new ReceiveOpenInboxEvent(action, getContainer());
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
		
		InvalidOpenInboxAction ila = new InvalidOpenInboxAction(sb.toString());
		InvalidOpenInboxEvent ile = new InvalidOpenInboxEvent(ila);
		eventBus.fireEvent(ile);
	}

  }