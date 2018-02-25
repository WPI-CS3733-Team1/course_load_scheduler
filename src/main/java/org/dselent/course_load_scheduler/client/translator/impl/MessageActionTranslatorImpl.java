package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveMessageAction;
import org.dselent.course_load_scheduler.client.action.SendMessageAction;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveMessageKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendMessageKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class MessageActionTranslatorImpl implements ActionTranslator<SendMessageAction, ReceiveMessageAction>
{
	
	@Override
	public JSONObject translateToJson(SendMessageAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendMessageKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendMessageKeys.MESSAGE), action.getMessage());

		return jsonObject;
	}
	
	@Override
	public ReceiveMessageAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveMessageKeys.ID));
		String authorUserName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveMessageKeys.AUTHOR_USER_NAME));
		String message = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveMessageKeys.MESSAGE));
		Long receivedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveMessageKeys.RECEIVED_AT));
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		Message msg= new Message();
		msg.setId(id);
		msg.setAuthorUserName(authorUserName);
		msg.setMessage(message);
		msg.setReceivedAt(new Date(receivedAt));
		
				
		// possibly use builder pattern if it is a lot of data
		ReceiveMessageAction action = new ReceiveMessageAction(msg);	
	
		return action;
	}


}
