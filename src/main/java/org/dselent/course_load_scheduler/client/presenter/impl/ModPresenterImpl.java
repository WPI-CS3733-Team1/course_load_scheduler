package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.ModView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ModPresenterImpl extends BasePresenterImpl implements ModPresenter {

	IndexPresenter parentPresenter;
	ModView view;
	
	@Inject
	public ModPresenterImpl(IndexPresenter parent, ModView view) {
		this.parentPresenter = parent;
		this.view = view;
		view.setPresenter(this);
	}
	
	
	@Override
	public void init() {
		bind();
	}
	
	@Override
	public void bind() {
		
	}
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public ModView getView() {
		return view;
	}

	@Override
	public IndexPresenter getParentPresenter() {
		// TODO Auto-generated method stub
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}

}
