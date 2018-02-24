package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenInboxAction;
import org.dselent.course_load_scheduler.client.action.SendOpenInboxAction;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveOpenInboxKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendOpenInboxKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;


public class OpenInboxActionTranslatorImpl implements ActionTranslator<SendOpenInboxAction, ReceiveOpenInboxAction>
{
	@Override
	public JSONObject translateToJson(SendOpenInboxAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendOpenInboxKeys.USER_NAME), action.getUserName());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveOpenInboxAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		List<Message> inboxMessages = new ArrayList<>();
		
		JSONValue jsonObject = json.get("success");
		JSONArray messageArray = jsonObject.isArray();
		
		for(int i = 0; i < messageArray.size(); i++) {
			JSONObject messageObject = jsonObject.isArray().get(i).isObject();
			
			Integer id = JSONHelper.getIntValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.ID));
			String authorUserName = JSONHelper.getStringValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.AUTHOR_USER_NAME));
			Integer userId = JSONHelper.getIntValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.USER_ID));
			String msg = JSONHelper.getStringValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.MESSAGE));
			Integer deptId = JSONHelper.getIntValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.DEPT_ID));
			Long receivedAt = JSONHelper.getLongValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.RECEIVED_AT));
			Boolean resolved= JSONHelper.getBooleanValue(messageObject, JSONHelper.convertKeyName(ReceiveOpenInboxKeys.RESOLVED));
			
			Message message= new Message();
			message.setId(id);
			message.setAuthorUserName(authorUserName);
			message.setDeptId(deptId);
			message.setUserId(userId);
			message.setMessage(msg);
			message.setResolved(resolved);
			message.setReceivedAt(new Date(receivedAt));
			
			inboxMessages.add(message);
		}
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		// possibly use builder pattern if it is a lot of data
		ReceiveOpenInboxAction action = new ReceiveOpenInboxAction(inboxMessages);	
	
		return action;
	}


}
