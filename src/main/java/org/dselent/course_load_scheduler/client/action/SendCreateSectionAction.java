package org.dselent.course_load_scheduler.client.action;

public class SendCreateSectionAction {
	String sectionExpectedPopulation;
	String sectionYear;
	String sectionType; 
	String sectionId;
	String sectionName;
	String sectionStartTime; 
	String sectionDaysOfTheWeek;
	String sectionRequiredFrequency; 
	String sectionCourse;
	String sectionCourseNumberOfSections; 
	
	
	public String getSectionExpectedPopulation() {
		return sectionExpectedPopulation;
	}
	public void setSectionExpectedPopulation(String sectionExpectedPopulation) {
		this.sectionExpectedPopulation = sectionExpectedPopulation;
	}
	public String getSectionYear() {
		return sectionYear;
	}
	public void setSectionYear(String sectionYear) {
		this.sectionYear = sectionYear;
	}
	@Override
	public String toString() {
		return "SendCreateSectionAction [sectionExpectedPopulation=" + sectionExpectedPopulation + ", sectionYear="
				+ sectionYear + ", sectionType=" + sectionType + ", sectionId=" + sectionId + ", sectionName="
				+ sectionName + ", sectionStartTime=" + sectionStartTime + ", sectionDaysOfTheWeek="
				+ sectionDaysOfTheWeek + ", sectionRequiredFrequency=" + sectionRequiredFrequency + ", sectionCourse="
				+ sectionCourse + ", sectionCourseNumberOfSections=" + sectionCourseNumberOfSections + ", sectionTerm="
				+ sectionTerm + "]";
	}
	public String getSectionType() {
		return sectionType;
	}
	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getSectionStartTime() {
		return sectionStartTime;
	}
	public void setSectionStartTime(String sectionStartTime) {
		this.sectionStartTime = sectionStartTime;
	}
	public String getSectionDaysOfTheWeek() {
		return sectionDaysOfTheWeek;
	}
	public void setSectionDaysOfTheWeek(String sectionDaysOfTheWeek) {
		this.sectionDaysOfTheWeek = sectionDaysOfTheWeek;
	}
	public String getSectionRequiredFrequency() {
		return sectionRequiredFrequency;
	}
	public void setSectionRequiredFrequency(String sectionRequiredFrequency) {
		this.sectionRequiredFrequency = sectionRequiredFrequency;
	}
	public String getSectionCourse() {
		return sectionCourse;
	}
	public void setSectionCourse(String sectionCourse) {
		this.sectionCourse = sectionCourse;
	}
	public String getSectionCourseNumberOfSections() {
		return sectionCourseNumberOfSections;
	}
	public void setSectionCourseNumberOfSections(String sectionCourseNumberOfSections) {
		this.sectionCourseNumberOfSections = sectionCourseNumberOfSections;
	}
	public String getSectionTerm() {
		return sectionTerm;
	}
	public void setSectionTerm(String sectionTerm) {
		this.sectionTerm = sectionTerm;
	}
	public SendCreateSectionAction(String sectionExpectedPopulation, String sectionYear, String sectionType,
			String sectionId, String sectionName, String sectionStartTime, String sectionDaysOfTheWeek,
			String sectionRequiredFrequency, String sectionCourse, String sectionCourseNumberOfSections,
			String sectionTerm) {
		super();
		this.sectionExpectedPopulation = sectionExpectedPopulation;
		this.sectionYear = sectionYear;
		this.sectionType = sectionType;
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.sectionStartTime = sectionStartTime;
		this.sectionDaysOfTheWeek = sectionDaysOfTheWeek;
		this.sectionRequiredFrequency = sectionRequiredFrequency;
		this.sectionCourse = sectionCourse;
		this.sectionCourseNumberOfSections = sectionCourseNumberOfSections;
		this.sectionTerm = sectionTerm;
	}
	String sectionTerm;
	
	

}
