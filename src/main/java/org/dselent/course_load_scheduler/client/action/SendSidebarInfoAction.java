package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.SidebarInfo;

public class SendSidebarInfoAction extends Action {
	String username;
	
	
	public SendSidebarInfoAction(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return "SendSidebarInfoAction [username=" + username + "]";
	}
	
}
