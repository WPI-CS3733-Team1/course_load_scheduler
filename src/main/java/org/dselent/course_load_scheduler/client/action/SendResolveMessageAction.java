package org.dselent.course_load_scheduler.client.action;

public class SendResolveMessageAction extends Action
{
	private String userName;
	private Integer messageId;
	
	public SendResolveMessageAction(String userName, Integer msgId)
	{
		this.userName = userName;
		this.messageId = msgId;
	}

	public String getUserName()
	{
		return userName;
	}
	
	public Integer getMessageId() {
		return messageId;
	}


	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OpenSearchAction [userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
