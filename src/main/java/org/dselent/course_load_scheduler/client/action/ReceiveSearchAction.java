package org.dselent.course_load_scheduler.client.action;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveSearchAction extends Action { 
	
	private List<User> usersList;
	private List<Course> coursesList;
	private String searchType;
	
	public ReceiveSearchAction(List<User> users_list, String search_type) {
		this.usersList = users_list;
		this.searchType = search_type;
		//will have some logic to pass in the radio button
	}
	
	public ReceiveSearchAction(ArrayList<Course> courses_list, String search_type) {
		this.coursesList = courses_list;
		this.searchType = search_type;
		//will have some logic to pass in the radio button
	}
	
	public void setSearchType() {
		//this.searchType = getSearchSearchType();
		//placeholder to listen for searchType
		//this will come from a radio button
	}
	
	public String getSearchType() {
		return this.searchType;
	}

	@Override
	public String toString() {
		return "ReceiveSearch [searchType=" + searchType + "]";
	}
	
	
}
