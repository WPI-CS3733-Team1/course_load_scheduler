package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminInboxPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminInboxView;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminInboxPresenterImpl extends BasePresenterImpl implements AdminInboxPresenter{
	
	private IndexPresenter parentPresenter;
	private AdminInboxView view;
	
	@Inject
	public AdminInboxPresenterImpl(IndexPresenter parentPresenter, AdminInboxView view)
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
	public AdminInboxView getView()
	{
		return view;
	}

	@Override
	public IndexPresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;		
	}



}
