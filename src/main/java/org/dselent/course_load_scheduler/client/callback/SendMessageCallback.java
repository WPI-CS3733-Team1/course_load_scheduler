package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidMessageAction;
import org.dselent.course_load_scheduler.client.action.ReceiveMessageAction;
import org.dselent.course_load_scheduler.client.event.InvalidMessageEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveMessageEvent;
import org.dselent.course_load_scheduler.client.translator.impl.MessageActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendMessageCallback extends DisplayCallback<JSONValue>
{
	public SendMessageCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		MessageActionTranslatorImpl MessageActionTranslator = new MessageActionTranslatorImpl();
		ReceiveMessageAction action = MessageActionTranslator.translateToAction(json);
		
		ReceiveMessageEvent event = new ReceiveMessageEvent(action, getContainer());
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
		
		InvalidMessageAction ila = new InvalidMessageAction(sb.toString());
		InvalidMessageEvent ile = new InvalidMessageEvent(ila);
		eventBus.fireEvent(ile);
	}

  }