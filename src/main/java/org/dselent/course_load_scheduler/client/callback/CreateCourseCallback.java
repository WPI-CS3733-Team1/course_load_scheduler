package org.dselent.course_load_scheduler.client.callback;

import org.dselent.course_load_scheduler.client.action.InvalidCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.event.InvalidCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCreateCourseEvent;
import org.dselent.course_load_scheduler.client.translator.impl.CreateCourseTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class CreateCourseCallback extends DisplayCallback<JSONValue> {
	
	public CreateCourseCallback(SimpleEventBus eventBus, HasWidgets container)
	{
		super(eventBus, container);
	}
	
	@Override
	public void onSuccess(JSONValue result)
	{
		JSONObject json = JSONHelper.getObjectValue(result);
		CreateCourseTranslatorImpl createCourseTranslator = new CreateCourseTranslatorImpl();
		ReceiveOpenCreateCourseAction action = createCourseTranslator.translateToAction(json);
		
		
		ReceiveCreateCourseEvent event =  new ReceiveCreateCourseEvent(action, getContainer());
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
		
		InvalidCreateCourseAction icca = new InvalidCreateCourseAction(sb.toString());
		InvalidCreateCourseEvent icce = new InvalidCreateCourseEvent(icca);
		eventBus.fireEvent(icce);
	}
}
