package org.dselent.course_load_scheduler.client.presenter;

public interface ModPresenter extends BasePresenter {

	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	
	
}
