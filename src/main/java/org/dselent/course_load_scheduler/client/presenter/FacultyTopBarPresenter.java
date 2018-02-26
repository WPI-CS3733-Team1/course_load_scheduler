package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;

public interface FacultyTopBarPresenter extends BasePresenter
{
	void setParentPresenter(FacultyPresenter parentPresenter);
	void FacultyTopBar();
	void openSchedule(String username, String string);
	void openSearch();
	void setView(FacultyTopBarView facultyTopBarView);
}
