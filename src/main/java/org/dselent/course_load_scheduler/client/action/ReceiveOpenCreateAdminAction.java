package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveOpenCreateAdminAction extends Action
{
	private User model;
	private List<User> userList;
	
	public ReceiveOpenCreateAdminAction(List<User> list)
	{
		this.userList = list;
	}

	public User getModel()
	{
		return model;
	}

	public void setModel(User model)
	{
		this.model = model;
	}
	
	public List<User> getUserList(){
		return userList;
	}
	
	public void setUserList(Integer pos, User usr) {
		userList.add(pos, usr);
	}
	
	public void clearUserList() {
		userList.clear();
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
