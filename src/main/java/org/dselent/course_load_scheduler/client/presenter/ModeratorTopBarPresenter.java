package org.dselent.course_load_scheduler.client.presenter;

public interface ModeratorTopBarPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void ModeratorTopBar();
	void openCreateAdmin(String userName);
	void openCreateCourse(String userName);
	void openSearch(String userName);
	void openCreateSection(String userName);
}
