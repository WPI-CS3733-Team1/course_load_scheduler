package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.SendCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.SendCreateSectionEvent;
import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.SendCreateSectionAction;
import org.dselent.course_load_scheduler.client.callback.OpenInboxCallback;
import org.dselent.course_load_scheduler.client.event.SendOpenInboxEvent;
import org.dselent.course_load_scheduler.client.action.SendOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.OpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.callback.OpenCreateAdminCallback;
import org.dselent.course_load_scheduler.client.callback.CreateCourseCallback;
import org.dselent.course_load_scheduler.client.callback.CreateSectionCallback;
import org.dselent.course_load_scheduler.client.event.SendOpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.action.SendOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.CreateCourseTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CreateSectionTranslatorImpl;
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
	
	public void onSendOpenInbox(SendOpenInboxEvent evt)
	{
		SendOpenInboxAction action = evt.getAction();
		OpenInboxActionTranslatorImpl openInboxActionTranslator = new OpenInboxActionTranslatorImpl();
		JSONObject json = openInboxActionTranslator.translateToJson(action);
		OpenInboxCallback openInboxCallback = new OpenInboxCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.OPEN_INBOX, openInboxCallback, json);
		request.send();
	}
    
    public void onSendOpenCreateAdmin(SendOpenCreateAdminEvent evt)
    {
        SendOpenCreateAdminAction action = evt.getAction();
        OpenCreateAdminActionTranslatorImpl openCreateAdminTranslator = new OpenCreateAdminActionTranslatorImpl();
        JSONObject json = openCreateAdminTranslator.translateToJson(action);
        OpenCreateAdminCallback openCreateAdminCallback = new OpenCreateAdminCallback(eventBus, evt.getContainer());
        
        NetworkRequest request = new NetworkRequest(NetworkRequestStrings.CREATE_ADMIN, openCreateAdminCallback, json);
        request.send();
    }
	
	public void onSendCreateCourse(SendCreateCourseEvent evt)
	{
		SendCreateCourseAction action = evt.getAction();
		CreateCourseTranslatorImpl createCourseActionTranslator = new CreateCourseTranslatorImpl();
		JSONObject json = createCourseActionTranslator.translateToJson(action);
		CreateCourseCallback createCourseCallback = new CreateCourseCallback(eventBus, evt.getContainer());	
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.CREATE_COURSE, createCourseCallback, json);
		request.send();
	}

	public void onSendCreateSection(SendCreateSectionEvent evt)
	{
		SendCreateSectionAction action = evt.getAction();
		CreateSectionTranslatorImpl createSectionActionTranslator = new CreateSectionTranslatorImpl();
		JSONObject json = createSectionActionTranslator.translateToJson(action);
		CreateSectionCallback createSectionCallback = new CreateSectionCallback(eventBus, evt.getContainer());
	
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.CREATE_SECTION, createSectionCallback, json);
		request.send();
	}
	
//	
//	@Override
//	public void  {}
}
