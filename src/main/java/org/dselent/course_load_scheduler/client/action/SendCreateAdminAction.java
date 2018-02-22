package org.dselent.course_load_scheduler.client.action;

public class SendCreateAdminAction {
	private String firstName;
	private String lastName;
	private String userName;
	private String title;
	private String department;
	
	public SendCreateAdminAction(String firstName, String lastName, String userName, String title, String department)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.title = title;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "SendCreateAdminAction [firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", title=" + title + ", department=" + department + "]";
	}
}
