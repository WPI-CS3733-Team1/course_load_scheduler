package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.CreateAdmin1Presenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CreateAdmin1View;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CreateAdmin1PresenterImpl extends BasePresenterImpl implements CreateAdmin1Presenter {
	
	private IndexPresenter parentPresenter;
	private CreateAdmin1View view;

	@Inject
	public CreateAdmin1PresenterImpl(IndexPresenter parent, CreateAdmin1View view) {
		this.parentPresenter = parent;
		this.view = view;
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
