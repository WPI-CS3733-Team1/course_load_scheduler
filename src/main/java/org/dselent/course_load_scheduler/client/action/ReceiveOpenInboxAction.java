package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Message;

public class ReceiveOpenInboxAction extends Action
{
	private Message model;
	private List<Message> messageList;
	
	public ReceiveOpenInboxAction(List<Message> messages)
	{
		this.messageList = messages;
	}

	public Message getModel()
	{
		return model;
	}

	public void setModel(Message model)
	{
		this.model = model;
	}
	
	public List<Message> getMessageList(){
		return messageList;
	}
	
	public void setMessageList(Integer pos, Message msg) {
		messageList.add(pos, msg);
	}
	
	public void clearMessageList() {
		messageList.clear();
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ReceiveLoginAction [model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
}
