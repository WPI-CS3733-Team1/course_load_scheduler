package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveResolveMessageAction;
import org.dselent.course_load_scheduler.client.action.SendResolveMessageAction;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveResolveMessageKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendResolveMessageKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class ResolveMessageActionTranslatorImpl implements ActionTranslator<SendResolveMessageAction, ReceiveResolveMessageAction>
{
	
	@Override
	public JSONObject translateToJson(SendResolveMessageAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendResolveMessageKeys.USER_NAME), action.getUserName());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendResolveMessageKeys.MESSAGE_ID), action.getMessageId());

		return jsonObject;
	}
	
	@Override
	public ReceiveResolveMessageAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
	
		// TODO look into time conversion more
		// put into JSONHelper?
		
		Message msg= new Message();
	
				
		// possibly use builder pattern if it is a lot of data
		ReceiveResolveMessageAction action = new ReceiveResolveMessageAction(msg);	
	
		return action;
	}


}
