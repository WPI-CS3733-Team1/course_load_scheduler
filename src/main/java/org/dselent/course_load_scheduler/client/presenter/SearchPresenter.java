package org.dselent.course_load_scheduler.client.presenter;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;

public interface SearchPresenter extends BasePresenter
{
	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
	List<User> searchUsers(String deptID);
	List<Course> searchCourses(String deptID);
	
}
