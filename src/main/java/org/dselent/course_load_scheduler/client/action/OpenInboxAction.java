package org.dselent.course_load_scheduler.client.action;

public class OpenInboxAction 
{
	private String userName;
	
	public OpenInboxAction(String userName)
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
		builder.append("OpenInboxAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
