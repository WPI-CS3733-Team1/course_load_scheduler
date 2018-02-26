package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.model.Section;

public class ReceiveConfirmScheduleAction extends Action{
	private Section model;
	private List<Section> sectionList;
	
	public ReceiveConfirmScheduleAction(List<Section> list) {
		this.sectionList = list;
	}

	public Section getModel() {
		return model;
	}

	public void setModel(Section model) {
		this.model = model;
	}
	
	public List<Section> getSectionList() {
		return sectionList;
	}
	
	public void setSectionList(Integer pos, Section section) {
		sectionList.add(pos, section);
	}
	
	public void clearSectionList() {
		sectionList.clear();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceiveConfirmSchedule [model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
}
