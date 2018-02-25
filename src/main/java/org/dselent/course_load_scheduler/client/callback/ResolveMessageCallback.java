package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidResolveMessageAction;
import org.dselent.course_load_scheduler.client.action.ReceiveResolveMessageAction;
import org.dselent.course_load_scheduler.client.event.InvalidResolveMessageEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveResolveMessageEvent;
import org.dselent.course_load_scheduler.client.translator.impl.ResolveMessageActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class ResolveMessageCallback extends DisplayCallback<JSONValue>
{
	public ResolveMessageCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		ResolveMessageActionTranslatorImpl resolveMessageActionTranslator = new ResolveMessageActionTranslatorImpl();
		ReceiveResolveMessageAction action = resolveMessageActionTranslator.translateToAction(json);
		
		ReceiveResolveMessageEvent event = new ReceiveResolveMessageEvent(action, getContainer());
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
		
		InvalidResolveMessageAction ila = new InvalidResolveMessageAction(sb.toString());
		InvalidResolveMessageEvent ile = new InvalidResolveMessageEvent(ila);
		eventBus.fireEvent(ile);
	}

  }