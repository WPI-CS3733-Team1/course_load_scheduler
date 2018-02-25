package org.dselent.course_load_scheduler.client.action;

public class SendMessageAction extends Action
{
	private String userName;
	private String message;
	
	public SendMessageAction(String userName, String message)
	{
		this.userName = userName;
		this.message = message;
	}

	public String getUserName()
	{
		return userName;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OpenSearchAction [userName=");
		builder.append(userName);
		builder.append(", message");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
}
