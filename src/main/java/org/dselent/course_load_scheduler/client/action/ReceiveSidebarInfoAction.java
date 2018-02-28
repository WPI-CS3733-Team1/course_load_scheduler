package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.SidebarInfo;

public class ReceiveSidebarInfoAction extends Action {

	SidebarInfo info;
	
	
	public ReceiveSidebarInfoAction(SidebarInfo info) {
		this.info = info;
	}
	
	public SidebarInfo getSidebarInfo() {
		return info;
	}
}
