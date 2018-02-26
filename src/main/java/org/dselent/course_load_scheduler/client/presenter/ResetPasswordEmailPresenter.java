package org.dselent.course_load_scheduler.client.presenter;

public interface ResetPasswordEmailPresenter extends BasePresenter {
	
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void resetPasswordEmail();
	
	

}
