package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.ReceiveSearchAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendSearchAction;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveSearchCoursesKeys;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveSearchUsersKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendLoginKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendSearchKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class SendSearchActionTranslatorImpl implements ActionTranslator<SendSearchAction, ReceiveSearchAction>
{
	
	String search_type;
	
	public void setSearchType(SendSearchAction action) {
		this.search_type = action.getSearchType();
	}
	
	@Override
	public JSONObject translateToJson(SendSearchAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendSearchKeys.KEY_VALUE), action.getDeptID());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendSearchKeys.REQUEST_TYPE), action.getSearchType());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveSearchAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		if ((JSONHelper.getStringValue(jsonObject)).equalsIgnoreCase("courses")) {
			
			JSONArray coursesArray = jsonObject.isArray();
			
			ArrayList<Course> coursesList = new ArrayList<Course>();
			
			for (int i=0; i<coursesList.size(); i++) {
				JSONObject courseObject = jsonObject.isArray().get(i).isObject();
				
				Integer id = JSONHelper.getIntValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.ID));
				String courseABRV = JSONHelper.getStringValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.COURSE_ABRV));
				String name = JSONHelper.getStringValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.NAME));
				Integer deptID = JSONHelper.getIntValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.DEPT_ID));
				String courseNum = JSONHelper.getStringValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.COURSE_NUM));
				Integer numLectures = JSONHelper.getIntValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.NUM_LECTURES));
				Integer numLabs = JSONHelper.getIntValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.NUM_LABS));
				Integer numConferences = JSONHelper.getIntValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.NUM_CONFERENCES));
				Long createdAt = JSONHelper.getLongValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.CREATED_AT));
				Long updatedAt = JSONHelper.getLongValue(courseObject, JSONHelper.convertKeyName(ReceiveSearchCoursesKeys.UPDATED_AT));
				
				Course c = new Course();
				c.setId(id);
				c.setCourseAbrv(courseABRV);
				c.setName(name);
				c.setDeptId(deptID);
				c.setCourseNum(courseNum);
				c.setNumLectures(numLectures);
				c.setNumLabs(numLabs);
				c.setNumConferences(numConferences);
				c.setCreatedAt(new Date(createdAt));
				c.setUpdatedAt(new Date(updatedAt));
				
				coursesList.add(c);
			}
			
			String searchType = JSONHelper.getStringValue(jsonObject);
			ReceiveSearchAction action = new ReceiveSearchAction(coursesList,searchType);
			return action;			
		}
		
		else {
			JSONArray usersArray = jsonObject.isArray();
			
			ArrayList<User> usersList = new ArrayList<User>();
			
			for (int i=0; i<usersList.size(); i++) {
				JSONObject userObject = jsonObject.isArray().get(i).isObject();
				
				Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.ID));
				String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.USER_NAME));
				String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.FIRST_NAME));
				String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.LAST_NAME));
				String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.EMAIL));
				Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.USER_STATE_ID));
				Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.CREATED_AT));
				Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveSearchUsersKeys.UPDATED_AT));
				
				User u = new User();
				u.setId(id);
				u.setUserName(userName);
				u.setFirstName(firstName);
				u.setLastName(lastName);
				u.setEmail(email);
				u.setUserStateId(userStateId);
				u.setCreatedAt(new Date(createdAt));
				u.setUpdatedAt(new Date(updatedAt));
				
				usersList.add(u);
			}
			
			String searchType = JSONHelper.getStringValue(jsonObject);
			ReceiveSearchAction action = new ReceiveSearchAction(usersList,searchType);
			return action;
		}
	
	}


}
