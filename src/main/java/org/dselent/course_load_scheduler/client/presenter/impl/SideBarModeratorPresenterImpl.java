package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarModeratorPresenter;
import org.dselent.course_load_scheduler.client.view.SideBarModeratorView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class SideBarModeratorPresenterImpl extends BasePresenterImpl implements SideBarModeratorPresenter{

	private BasePresenter parentPresenter;
	private SideBarModeratorView view;
	
	@Inject
	public SideBarModeratorPresenterImpl(IndexPresenter parentPresenter, SideBarModeratorView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
	}
	
	@Override
	public void init() {
		bind();
	}
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
		
	}

	@Override
	public SideBarModeratorView getView() {
		return view;
	}

	@Override
	public BasePresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(BasePresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
		
	}
	
	

}
