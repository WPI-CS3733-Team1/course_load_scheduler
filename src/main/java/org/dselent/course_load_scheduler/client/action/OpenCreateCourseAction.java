package org.dselent.course_load_scheduler.client.action;

public class OpenCreateCourseAction extends Action
{
	private String userName;
	
	public OpenCreateCourseAction(String userName)
	{
		this.userName = userName;
	}

	public String getUserName()
	{
		return userName;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OpenCreateCourseAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
