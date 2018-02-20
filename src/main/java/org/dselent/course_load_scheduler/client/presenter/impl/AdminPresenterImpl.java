package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminView;
import org.dselent.course_load_scheduler.client.view.BaseView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminPresenterImpl extends BasePresenterImpl implements AdminPresenter {
	
	private IndexPresenter parentPresenter;
	private AdminView view;
	
	@Inject
	public AdminPresenterImpl(IndexPresenter parentPresenter, AdminView view) {
		this.parentPresenter = parentPresenter;
		this.view = view;
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
	public AdminView getView() {
		// TODO Auto-generated method stub
		return view;
	}

	@Override
	public void bind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind() {
		// TODO Auto-generated method stub	
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
