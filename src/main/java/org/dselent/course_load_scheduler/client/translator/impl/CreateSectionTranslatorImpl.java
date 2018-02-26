package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateSectionAction;
import org.dselent.course_load_scheduler.client.action.SendCreateSectionAction;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.action.SendOpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.model.Section;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCreateSectionKeys;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveOpenCreateAdminKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendCreateSectionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendOpenCreateAdminKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
/**
 * 
 * @author Surya
 *
 */
public class CreateSectionTranslatorImpl implements ActionTranslator<SendCreateSectionAction, ReceiveOpenCreateSectionAction> {
	
	@Override
	public JSONObject translateToJson(SendCreateSectionAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendCreateSectionKeys.SECTION_NAME), action.getSectionName());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveOpenCreateSectionAction translateToAction(JSONObject json)
	{
		List<Section> sectionList = new ArrayList<>();
		
		JSONValue jsonObject = json.get("success");
		JSONArray sectionArray = jsonObject.isArray();
		
		for(int i = 0; i < sectionArray.size(); i++) {
			JSONObject sectionObject = jsonObject.isArray().get(i).isObject();
			
																		/*
																		 * 	COURSE_ID,
																CRN,
																SECTION_NAME,
																SECTION_ID,
																EXPECTED_POP,
																REQUIRED_FREQ,
																ACADEMIC_YEAR,
																ACADEMIC_TERM,
																START_TIME,
																END_TIME,
																DAYS_PER_WEEK,
																COURSE_LOCATION;
															
																		 */
			Section section = new Section();
			Integer courseId = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.COURSE_ID));
			Integer crn = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.CRN));
			String sectionName = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.SECTION_NAME));
			Integer sectionId = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.SECTION_ID));
			Integer expectedPop = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.EXPECTED_POP));
			Integer requiredFreq = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.REQUIRED_FREQ));
			Integer academicYear = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.ACADEMIC_YEAR));
			Integer academicTerm = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.ACADEMIC_TERM));
			Integer startTime = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.START_TIME));
			Integer endTime = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.END_TIME));
			String daysPerWeek = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.DAYS_PER_WEEK));
			String courseLocation = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveCreateSectionKeys.COURSE_LOCATION));
			
			sectionList.add(section);
		}
			
		ReceiveOpenCreateSectionAction action = new ReceiveOpenCreateSectionAction(sectionList);	
		return action;
		}
	}
