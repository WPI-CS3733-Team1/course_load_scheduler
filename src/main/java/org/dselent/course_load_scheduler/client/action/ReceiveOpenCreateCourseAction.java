package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveOpenCreateCourseAction extends Action {
	private Course model;
	private List<Course> courseList;
	
	public ReceiveOpenCreateCourseAction(List<Course> courseList)
	{
		this.courseList = courseList;
	}
	
	public Course getModel()
	{
		return model;
	}
	
	public void setModel(Course model)
	{
		this.model  = model;
	}
	
	public List<Course> getCourseList(){
		return courseList;
	}
	
	public void setCourseList(Integer pos, Course cse) {
		courseList.add(pos, cse);
	}
	
	public void clearCourseList() {
		courseList.clear();
	}

	@Override
	public String toString() {
		return "ReceiveOpenCreateCourseAction [model=" + model + ", courseList=" + courseList + "]";
	}

	
}
