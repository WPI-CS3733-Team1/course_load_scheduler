package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ResetPasswordPresenter;
import org.dselent.course_load_scheduler.client.view.AdminInboxView;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.ResetPasswordView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ResetPasswordPresenterImpl extends BasePresenterImpl implements ResetPasswordPresenter {

	private ResetPasswordView view;
	private IndexPresenter parentPresenter;
	private boolean openResetPasswordButtonInProgress;
	
	@Inject
	public ResetPasswordPresenterImpl(IndexPresenter parentPresenter, ResetPasswordView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
	}
	
	@Override
	public void go(HasWidgets container) 
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public BaseView<? extends BasePresenter> getView() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexPresenter getParentPresenter() 
	{
		return parentPresenter;
	}

}
