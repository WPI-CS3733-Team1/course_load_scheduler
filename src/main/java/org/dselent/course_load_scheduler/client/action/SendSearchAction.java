package org.dselent.course_load_scheduler.client.action;

public class SendSearchAction extends Action { 
	
	private int deptID;
	private String searchType;
	
	public SendSearchAction(int dept_id, String search_type) {
		this.deptID = dept_id;
		this.searchType = search_type;
		//will have some logic to pass in the radio button
	}
	
	public int getDeptID() {
		return deptID;
	}
	
	public void setDeptID() {
		//this.deptID = getSearchDeptID(); 
		//placeholder to listen for deptID
		//list of deptID defined in search view and depend
		// on search type
	}
	
	public void setSearchType() {
		//this.searchType = getSearchSearchType();
		//placeholder to listen for searchType
		//this will come from a radio button
	}
	
	public String getSearchType() {
		return this.searchType;
	}
	
	public void setModel(int dept_id) { 
		this.deptID = dept_id;			
	}

	@Override
	public String toString() {
		return "SendSearch [deptID=" + deptID + "]";
	}
	
	
}
