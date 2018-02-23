package org.dselent.course_load_scheduler.client.action;

public class SendCreateAdminAction {
	private String moderatorUserName;
	private String facultyUserName;
	
	public SendCreateAdminAction(String moderatorUserName, String facultyUserName) {
		this.moderatorUserName = moderatorUserName;
		this.facultyUserName = facultyUserName;
	}

	public String getModeratorUserName() {
		return moderatorUserName;
	}

	public String getFacultyUserName() {
		return facultyUserName;
	}

	@Override
	public String toString() {
		return "SendCreateAdminAction [moderatorUserName=" + moderatorUserName + ", facultyUserName=" + facultyUserName + "]";
	}
}
