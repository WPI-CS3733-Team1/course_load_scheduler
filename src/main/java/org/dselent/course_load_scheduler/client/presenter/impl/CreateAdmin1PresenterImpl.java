package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.CreateAdmin1Presenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CreateAdmin1View;

import com.google.gwt.user.client.ui.HasWidgets;

public class CreateAdmin1PresenterImpl extends BasePresenterImpl implements CreateAdmin1Presenter {
	
	private IndexPresenter parentPresenter;
	private CreateAdmin1View view;

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
	public CreateAdmin1View getView() {
		return view;
	}

	@Override
	public void bind() {
		/*
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
		*/
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
	public void createAdmin1() {
		// TODO Auto-generated method stub
	}
}
