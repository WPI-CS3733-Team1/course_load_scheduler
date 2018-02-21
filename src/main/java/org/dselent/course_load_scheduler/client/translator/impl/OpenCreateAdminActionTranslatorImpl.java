package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.action.SendOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveOpenCreateAdminKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendOpenCreateAdminKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class OpenCreateAdminActionTranslatorImpl implements ActionTranslator<SendOpenCreateAdminAction, ReceiveOpenCreateAdminAction>
{
	@Override
	public JSONObject translateToJson(SendOpenCreateAdminAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendOpenCreateAdminKeys.USER_NAME), action.getUserName());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveOpenCreateAdminAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)

		List<User> facultyList = new ArrayList<>();
		
		JSONValue jsonObject = json.get("success");
		JSONArray userArray = jsonObject.isArray();
		
		for(int i = 0; i < userArray.size(); i++) {
		JSONObject userObject = jsonObject.isArray().get(i).isObject();
		
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.EMAIL));
		Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.USER_STATE_ID));
		Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveOpenCreateAdminKeys.UPDATED_AT));

		
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setUserStateId(userStateId);
		user.setCreatedAt(new Date(createdAt));
		user.setUpdatedAt(new Date(updatedAt));
		
		facultyList.add(user);
		}
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		// possibly use builder pattern if it is a lot of data
		ReceiveOpenCreateAdminAction action = new ReceiveOpenCreateAdminAction(facultyList);	
	
		return action;
	}


}
