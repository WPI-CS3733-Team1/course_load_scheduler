package org.dselent.course_load_scheduler.client.presenter;

public interface SideBarPresenter extends BasePresenter{

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
}
