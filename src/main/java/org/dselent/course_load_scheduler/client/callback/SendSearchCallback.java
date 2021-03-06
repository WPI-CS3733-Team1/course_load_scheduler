package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveSearchAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveSearchEvent;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.SendSearchActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendSearchCallback extends DisplayCallback<JSONValue>
{
	public SendSearchCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	  
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		SendSearchActionTranslatorImpl sendSearchActionTranslator = new SendSearchActionTranslatorImpl();
		ReceiveSearchAction action = sendSearchActionTranslator.translateToAction(json);
		
		ReceiveSearchEvent event = new ReceiveSearchEvent(action, getContainer());
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
		
		//InvalidLoginAction ila = new InvalidLoginAction(sb.toString());
		//InvalidLoginEvent ile = new InvalidLoginEvent(ila);
		//eventBus.fireEvent(ile);
		// change to InvalidSearchAction
	}

  }