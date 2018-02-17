package org.dselent.course_load_scheduler.client.presenter;

public interface ModeratorTopBarPresenter extends BasePresenter{
	ModeratorTopBarPresenter getParentPresenter();
	void setParentPresenter(ModeratorTopBarPresenter parentPresenter);
	void ModeratorTopBar();
	void openCreateAdmin(String userName);
	void openCreateCourse(String userName);
	void openSearch(String userName);
}
