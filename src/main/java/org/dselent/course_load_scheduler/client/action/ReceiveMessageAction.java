package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.Message;

public class ReceiveMessageAction extends Action
{
	private Message model;
	
	public ReceiveMessageAction(Message model)
	{
		this.model = model;
	}

	public Message getModel()
	{
		return model;
	}

	public void setModel(Message model)
	{
		this.model = model;
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
