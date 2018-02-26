package org.dselent.course_load_scheduler.client.presenter;

public interface SideBarModeratorPresenter extends BasePresenter {

	BasePresenter getParentPresenter();
	void setParentPresenter(BasePresenter parentPresenter);
}
