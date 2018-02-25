package org.dselent.course_load_scheduler.client.action;

public class SendOpenScheduleRequestAction extends Action
{
	private String userName;
	
	public SendOpenScheduleRequestAction(String userName)
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
		builder.append("SendOpenInboxAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
