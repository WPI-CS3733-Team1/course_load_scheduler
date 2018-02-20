package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateAdmin2Presenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.CreateAdmin2View;

import com.google.gwt.user.client.ui.HasWidgets;

public class CreateAdmin2PresenterImpl extends BasePresenterImpl implements CreateAdmin2Presenter {

	private IndexPresenter parentPresenter;
	private CreateAdmin2View view;
	
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
	public CreateAdmin2View getView() {
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

	@Override
	public void createAdmin2() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {
		// TODO Auto-generated method stub
		
	}
}
