package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.OpenInboxEvent;
import org.dselent.course_load_scheduler.client.action.OpenInboxAction;
import org.dselent.course_load_scheduler.client.callback.OpenInboxCallback;
import org.dselent.course_load_scheduler.client.event.SendOpenInboxEvent;
import org.dselent.course_load_scheduler.client.action.SendOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.OpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.callback.OpenCreateAdminCallback;
import org.dselent.course_load_scheduler.client.event.SendOpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.action.SendOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.OpenInboxActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.OpenCreateAdminActionTranslatorImpl;
/*
 * openCreateAdminEvent
 * openInboxEvent
 * 
 */

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class UserServiceImpl extends BaseServiceImpl implements UserService
{
	public UserServiceImpl()
	{
		
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(SendLoginEvent.TYPE, this);
		eventBusRegistration.put(SendLoginEvent.TYPE, registration);
	}
	
	@Override
	public void onSendLogin(SendLoginEvent evt)
	{
		SendLoginAction action = evt.getAction();
		LoginActionTranslatorImpl loginActionTranslator = new LoginActionTranslatorImpl();
		JSONObject json = loginActionTranslator.translateToJson(action);
		SendLoginCallback loginCallback = new SendLoginCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, loginCallback, json);
		request.send();
	}
//	
//	@Override
//	public void  {}
}
