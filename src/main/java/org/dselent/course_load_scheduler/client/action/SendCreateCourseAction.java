package org.dselent.course_load_scheduler.client.action;

public class SendCreateCourseAction {
	private String courseName;
	private String courseNumber;
	private String courseSections;
	
	public SendCreateCourseAction(String courseName, String courseNumber, String courseSections)
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.courseSections = courseSections;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public String getCourseSections() {
		return courseSections;
	}

	@Override
	public String toString() {
		return "SendCreateCourseAction [courseName=" + courseName + ", courseNumber=" + courseNumber
				+ ", courseSections=" + courseSections + "]";
	}
	
	
	
}
