package org.dselent.course_load_scheduler.client.action;

public class SendOpenCreateAdminAction extends Action
{
	private String userName;
	
	public SendOpenCreateAdminAction(String userName, String password)
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
		builder.append("SendOpenCreateAdminAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
