package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.ReceiveOpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.SendCreateCourseAction;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveOpenCreateCourseKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendCreateCourseKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.json.client.JSONArray;
/**
 * 
 * @author Surya
 *
 */
public class CreateCourseTranslatorImpl
		implements ActionTranslator<SendCreateCourseAction, ReceiveOpenCreateCourseAction> {

	@Override
	public JSONObject translateToJson(SendCreateCourseAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendCreateCourseKeys.NAME),
				action.getCourseName());

		return jsonObject;
	}

	@Override
	public ReceiveOpenCreateCourseAction translateToAction(JSONObject json) {
		List<Course> courseList = new ArrayList<>();

		JSONValue jsonObject = json.get("success");
		JSONArray courseArray = jsonObject.isArray();

		for (int i = 0; i < courseArray.size(); i++) {
			JSONObject courseObject = jsonObject.isArray().get(i).isObject();
			String name = JSONHelper.getStringValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.NAME));
			Integer deptId = JSONHelper.getIntValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.DEPT_ID));
			String courseAbrv = JSONHelper.getStringValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.COURSE_ABRV));
			String courseNum = JSONHelper.getStringValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.COURSE_NUMBER));
			Integer numberOfLectures = JSONHelper.getIntValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.NUMBER_OF_LECTURES));
			Integer numberOfConferences = JSONHelper.getIntValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.NUMBER_OF_CONFERENCES));
			Integer numberOfLabs = JSONHelper.getIntValue(courseObject,
					JSONHelper.convertKeyName(ReceiveOpenCreateCourseKeys.NUMBER_OF_LABS));

			Course course = new Course();
			course.setName(name);
			course.setDeptId(deptId);
			course.setCourseAbrv(courseAbrv);
			course.setCourseNum(courseNum);
			course.setNumLectures(numberOfLectures);
			course.setNumConferences(numberOfConferences);
			course.setNumLabs(numberOfLabs);

			courseList.add(course);

		}

		ReceiveOpenCreateCourseAction action = new ReceiveOpenCreateCourseAction(courseList);

		return action;
	}

}
