package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.action.SendRegisterNewUserAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveRegisterNewUserKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendRegisterNewUserKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class RegisterNewUserTranslatorImpl implements ActionTranslator<SendRegisterNewUserAction, ReceiveRegisterNewUserAction>{
	
	@Override
	public JSONObject translateToJson(SendRegisterNewUserAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendRegisterNewUserKeys.FIRST_NAME), action.getFirstName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendRegisterNewUserKeys.LAST_NAME), action.getLastName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendRegisterNewUserKeys.EMAIL), action.getEmail());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendRegisterNewUserKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendRegisterNewUserKeys.PASSWORD), action.getPassword());
		return jsonObject;
	}
	
	@Override
	public ReceiveRegisterNewUserAction translateToAction(JSONObject json)
	{		

		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();

		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.EMAIL));
		Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.USER_STATE_ID));
		Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveRegisterNewUserKeys.UPDATED_AT));

		
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setUserStateId(userStateId);
		user.setCreatedAt(new Date(createdAt));
		user.setUpdatedAt(new Date(updatedAt));
		
		// possibly use builder pattern if it is a lot of data
		ReceiveRegisterNewUserAction action = new ReceiveRegisterNewUserAction(user);	
	
		return action;
	}

}
