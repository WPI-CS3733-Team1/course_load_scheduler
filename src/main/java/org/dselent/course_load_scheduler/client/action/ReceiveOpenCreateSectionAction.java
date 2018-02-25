package org.dselent.course_load_scheduler.client.action;

import java.util.List;

import org.dselent.course_load_scheduler.client.action.Action;
import org.dselent.course_load_scheduler.client.model.Section;

public class ReceiveOpenCreateSectionAction extends Action {
	private Section model;
	private List<Section> sectionList;
	
	public ReceiveOpenCreateSectionAction(List<Section> list)
	{
		this.sectionList = list;
	}
	
	public Section getModel()
	{
		return model;
	}
	
	public void setModel(Section model)
	{
		this.model  = model;
	}
	
	public List<Section> getSectionList(){
		return sectionList;
	}
	
	public void setSectionList(Integer pos, Section usr) {
		sectionList.add(pos, usr);
	}
	
	public void clearSectionList() {
		sectionList.clear();
	}

	@Override
	public String toString() {
		return "ReceiveOpenCreateSectionAction [model=" + model + ", sectionList=" + sectionList + "]";
	}

}