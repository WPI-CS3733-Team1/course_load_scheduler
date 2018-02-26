package org.dselent.course_load_scheduler.client.action;

import java.util.List;

public class SendConfirmScheduleAction extends Action {
	private String userName;
	private List<String> removeSectionIds;
	private List<String> addSectionIds;
	
	public SendConfirmScheduleAction(String userName, List<String> removeSectionIds, List<String> addSectionIds) {
		this.userName = userName;
		this.removeSectionIds = removeSectionIds;
		this.addSectionIds = addSectionIds;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public List<String> getRemoveSectionIds() {
		return removeSectionIds;
	}
	
	public List<String> getAddSectionIds() {
		return addSectionIds;
	}
	
	@Override
	public String toString() {
		return "SendConfirmSchedule [userName=" + userName + ", removeSectionIds=" + removeSectionIds.toString() + ", addSectionIds" + addSectionIds.toString() + "]";
	}
}
