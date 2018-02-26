package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.callback.OpenScheduleCallback;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveScheduleEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.ScheduleService;
import org.dselent.course_load_scheduler.client.translator.impl.OpenScheduleActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

/*
 * @author Noah 
 */

public class ScheduleServiceImpl extends BaseServiceImpl implements ScheduleService {

	@Override
	public void init() {
		bind();
	}

	@Override
	public void bind() {
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(OpenScheduleEvent.TYPE, this);
		eventBusRegistration.put(OpenScheduleEvent.TYPE, registration);
	}

	
	@Override
	public void onOpenSchedule(OpenScheduleEvent evt) {
		
		OpenScheduleAction action = evt.getAction();
		OpenScheduleActionTranslatorImpl t = new OpenScheduleActionTranslatorImpl();
		JSONObject json = t.translateToJson(action);
		
		OpenScheduleCallback callback = new OpenScheduleCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.REQUEST_SCHEDULE, callback, json);
		request.send();
	}
}
