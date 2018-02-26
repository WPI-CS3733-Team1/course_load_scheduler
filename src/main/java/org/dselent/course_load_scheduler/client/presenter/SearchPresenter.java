package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;

public interface SearchPresenter extends BasePresenter
{
	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
	public void checkEmptyString(String string) throws EmptyStringException;
	public boolean validateDeptID(String deptID);
	void sendSearchUsers(String deptID);
	void sendSearchCourses(String deptID);
	
}
