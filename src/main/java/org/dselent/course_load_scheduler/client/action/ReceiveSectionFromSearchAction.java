package org.dselent.course_load_scheduler.client.action;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.model.CompleteSection;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.model.Section;

public class ReceiveSectionFromSearchAction extends Action { 
	
	List<Section> courseSections;
	
	public ReceiveSectionFromSearchAction(ArrayList<Section> course_sections) {
		this.courseSections = course_sections;
	}
	
	public List<Section> getCourseSections() {
		return courseSections;
	}
	
	public void setModel(List<Section> course_sections) { 
		this.courseSections = course_sections;			
	}

	@Override
	public String toString() {
		return "ReceiveSectionFromSearch [courseSections=" + courseSections + "]";
	}
	
	
}
