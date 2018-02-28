package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveSidebarInfoAction;
import org.dselent.course_load_scheduler.client.action.SendSidebarInfoAction;
import org.dselent.course_load_scheduler.client.model.SidebarInfo;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveSidebarInfoKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendSidebarInfoKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class SidebarInfoTranslatorImpl implements ActionTranslator<SendSidebarInfoAction, ReceiveSidebarInfoAction>{

	@Override
	public JSONObject translateToJson(SendSidebarInfoAction action) {
		
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendSidebarInfoKeys.USER_NAME), action.getUsername());
		
		return jsonObject;
	}

	@Override
	public ReceiveSidebarInfoAction translateToAction(JSONObject json) {
		
		JSONValue jsonObject = json.get("success");
		JSONObject sidebarObject = jsonObject.isArray().get(0).isObject();
		
		Integer id = JSONHelper.getIntValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.ID));
		String userName = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.EMAIL));
		String roleName = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.ROLE_NAME));
		String departmentName = JSONHelper.getStringValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.DEPT_NAME));
		Long createdAt = JSONHelper.getLongValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(sidebarObject, JSONHelper.convertKeyName(ReceiveSidebarInfoKeys.UPDATED_AT));
		
		
		SidebarInfo info = new SidebarInfo();
		info.setId(id);
		info.setUserName(userName);
		info.setFirstName(firstName);
		info.setLastName(lastName);
		info.setEmail(email);
		info.setRoleName(roleName);
		info.setDepartmentName(departmentName);
		info.setCreatedAt(new Date(createdAt));
		info.setUpdatedAt(new Date(updatedAt));
		
		
		
		return new ReceiveSidebarInfoAction(info);
	}

}
