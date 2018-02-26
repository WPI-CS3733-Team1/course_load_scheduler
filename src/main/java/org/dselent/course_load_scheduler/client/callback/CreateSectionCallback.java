package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidCreateSectionAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateSectionAction;
import org.dselent.course_load_scheduler.client.event.InvalidCreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCreateSectionEvent;
import org.dselent.course_load_scheduler.client.translator.impl.CreateSectionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class CreateSectionCallback extends DisplayCallback<JSONValue> {
	
	public CreateSectionCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		CreateSectionTranslatorImpl createSectionActionTranslator = new CreateSectionTranslatorImpl();
		ReceiveOpenCreateSectionAction action = createSectionActionTranslator.translateToAction(json);
		
		ReceiveCreateSectionEvent event = new ReceiveCreateSectionEvent(action, getContainer());
		eventBus.fireEvent(event);
	}
	
	@Override
	public void onFailure(Throwable caught)
	{
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		InvalidCreateSectionAction icsa = new InvalidCreateSectionAction(sb.toString());
		InvalidCreateSectionEvent icse = new InvalidCreateSectionEvent(icsa);
		eventBus.fireEvent(icse);
	}
	
	
	
	

}
