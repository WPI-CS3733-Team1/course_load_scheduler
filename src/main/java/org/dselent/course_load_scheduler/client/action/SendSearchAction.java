package org.dselent.course_load_scheduler.client.action;

public class SendSearchAction extends Action { 
	
	private int deptID;
	private String searchType;
	
	public SendSearchAction(String dept_id, String search_type) {
		this.deptID = Integer.parseInt(dept_id);
		this.searchType = search_type;
	}
	
	public int getDeptID() {
		return deptID;
	}
	
	public void setDeptID(int dept_id) {
		this.deptID = dept_id;
	}
	public String getSearchType() {
		return searchType;
	}
	
	public void setSearchType(String search_type) {
		this.searchType = search_type;
	}
	
	public void setModel(int dept_id) { 
		this.deptID = dept_id;			
	}

	@Override
	public String toString() {
		return "SendSearch [deptID=" + deptID + "]";
	}
	
	
}
