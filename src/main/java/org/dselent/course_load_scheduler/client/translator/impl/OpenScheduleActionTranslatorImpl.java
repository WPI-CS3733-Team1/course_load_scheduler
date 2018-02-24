package org.dselent.course_load_scheduler.client.translator.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.ReceiveScheduleAction;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.model.Section;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveSectionKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendOpenScheduleKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class OpenScheduleActionTranslatorImpl implements ActionTranslator<OpenScheduleAction, ReceiveScheduleAction>{

	@Override
	public JSONObject translateToJson(OpenScheduleAction action) {
		
		
		
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendOpenScheduleKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendOpenScheduleKeys.TERM), action.getTerm());
		
		
		
		return jsonObject;
	}

	@Override
	public ReceiveScheduleAction translateToAction(JSONObject json) {
		
		List<Section> inboxMessages = new ArrayList<>();
		
		JSONValue jsonObject = json.get("success");
		JSONArray sectionArray = jsonObject.isArray();
		
		ArrayList<Section> schedule = new ArrayList<Section>();
		
		
		for(int i = 0; i<sectionArray.size(); i++) {
			JSONObject sectionObject = jsonObject.isArray().get(i).isObject();
			
			Integer id = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.ID));
			Integer courseID = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.COURSE_ID));
			Integer CRN = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.CRN));
			String sectionName = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.SECTION_NAME));
			Integer sectionID = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.SECTION_ID));
			Integer expectedPop = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.EXPECTED_POP));
			Integer requiredFreq = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.REQUIRED_FREQ));
			Integer academicYear = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.ACADEMIC_YEAR));
			String academicTerm = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.ACADEMIC_TERM));
			Integer startTime = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.START_TIME));
			Integer endTime = JSONHelper.getIntValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.END_TIME));
			String daysPerWeek = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.DAYS_PER_WEEK));
			String courseLocation = JSONHelper.getStringValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.COURSE_LOCATION));
			Long createdAt = JSONHelper.getLongValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.CREATED_AT));
			Long updatedAt = JSONHelper.getLongValue(sectionObject, JSONHelper.convertKeyName(ReceiveSectionKeys.UPDATED_AT));
			
			
			//create model and add to list
			Section s = new Section();
			s.setId(id);
			s.setCourseId(courseID);
			s.setCRN(CRN);
			s.setSectionName(sectionName);
			s.setSectionId(sectionID);
			s.setExpectedPop(expectedPop);
			s.setRequiredFreq(requiredFreq);
			s.setAcademicYear(academicYear);
			s.setStartTime(startTime);
			s.setEndTime(endTime);
			s.setDaysPerWeek(daysPerWeek);
			s.setCourseLocation(courseLocation);
			s.setCreatedAt(new Date(createdAt));
			s.setUpdatedAt(new Date(updatedAt));
			
			schedule.add(s);
		}
		
		ReceiveScheduleAction action = new ReceiveScheduleAction(schedule);
		
		return action;
	}

}
