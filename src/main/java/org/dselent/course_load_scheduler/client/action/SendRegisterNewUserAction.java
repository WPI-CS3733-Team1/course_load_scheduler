package org.dselent.course_load_scheduler.client.action;

public class SendRegisterNewUserAction extends Action{
	
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;

	public SendRegisterNewUserAction(String firstName, String lastName, String email, String userName, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "SendRegisterNewUserAction [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
}
