package org.dselent.course_load_scheduler.client.action;

public class OpenCreateAdminAction 
{
	private String userName;
	
	public OpenCreateAdminAction(String userName)
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
		builder.append("OpenCreateAdminAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
