package org.dselent.course_load_scheduler.client.presenter;

public interface CreateAdmin1Presenter extends BasePresenter {
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void createAdmin1();
	void selectUser();
}
