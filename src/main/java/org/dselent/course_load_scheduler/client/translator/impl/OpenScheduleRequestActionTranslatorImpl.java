package org.dselent.course_load_scheduler.client.translator.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.SendOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.action.ReceiveOpenScheduleRequestAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class OpenScheduleRequestActionTranslatorImpl implements ActionTranslator<SendOpenScheduleRequestAction, ReceiveOpenScheduleRequestAction>{

	@Override
	public JSONObject translateToJson(SendOpenScheduleRequestAction action) {
		
		
		
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendLoginKeys.USER_NAME), action.getUserName());
		
		
		
		return jsonObject;
	}

	@Override
	public ReceiveOpenScheduleRequestAction translateToAction(JSONObject json) {
		
		List<User> users = new ArrayList<>();
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.EMAIL));
		Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_STATE_ID));
		Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.UPDATED_AT));
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setUserStateId(userStateId);
		user.setCreatedAt(new Date(createdAt));
		user.setUpdatedAt(new Date(updatedAt));
			
		users.add(user);

		ReceiveOpenScheduleRequestAction action = new ReceiveOpenScheduleRequestAction(user);
		
		return action;
	}

}
