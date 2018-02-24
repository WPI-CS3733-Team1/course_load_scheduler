package org.dselent.course_load_scheduler.client.presenter;

public interface CreateAdminPresenter extends BasePresenter {
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void createAdmin();
	void selectUser();
}
