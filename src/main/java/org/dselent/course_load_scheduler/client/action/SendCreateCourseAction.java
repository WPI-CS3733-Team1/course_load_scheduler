package org.dselent.course_load_scheduler.client.action;

public class SendCreateCourseAction extends Action {
	private String courseName;
	private String courseNumber;
	private String courseDepartment;
	private String courseLabs;
	private String courseLectures;
	private String courseConferences;
	
	public SendCreateCourseAction(String courseName, String courseNumber, String courseDepartment, String courseLectures, String courseLabs, String courseConferences)
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.courseDepartment = courseDepartment;
		this.courseConferences = courseConferences;
		this.courseLectures = courseLectures;
		this.courseLabs = courseLabs;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public String getCourseDepartment() {
		return courseDepartment;
	}

	public String getCourseLabs() {
		return courseLabs;
	}

	public String getCourseLectures() {
		return courseLectures;
	}

	public String getCourseConferences() {
		return courseConferences;
	}

	@Override
	public String toString() {
		return "SendCreateCourseAction [courseName=" + courseName + ", courseNumber=" + courseNumber
				+ ", courseDepartment=" + courseDepartment + ", courseLabs=" + courseLabs + ", courseLectures="
				+ courseLectures + ", courseConferences=" + courseConferences + "]";
	}

	
	
	
}
