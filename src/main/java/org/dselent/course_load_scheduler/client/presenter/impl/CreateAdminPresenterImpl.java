package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.SendCreateAdminAction;
import org.dselent.course_load_scheduler.client.event.SendCreateAdminEvent;
import org.dselent.course_load_scheduler.client.presenter.CreateAdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CreateAdminView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CreateAdminPresenterImpl extends BasePresenterImpl implements CreateAdminPresenter {
	
	private IndexPresenter parentPresenter;
	private CreateAdminView view;
	private boolean toggleAdminClickInProgress;

	@Inject
	public CreateAdminPresenterImpl(IndexPresenter parent, CreateAdminView view) {
		this.parentPresenter = parent;
		this.view = view;
		view.setPresenter(this);
		toggleAdminClickInProgress = false;
		view.getAdminToggle().setEnabled(false);
		view.getAdminToggle().setText("No Faculty Selected");
	}
	
	private void sendCreateAdmin(String moderatorUserName, String facultyUserName) {
		SendCreateAdminAction scca = new SendCreateAdminAction(moderatorUserName, facultyUserName);
		SendCreateAdminEvent scce = new SendCreateAdminEvent(scca);
		eventBus.fireEvent(scce);
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
	public CreateAdminView getView() {
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
	public void selectUser() {
		view.getAdminToggle().setEnabled(true);
		view.getUserNameLabel().setText(view.getProfessorList().getSelectedValue());
	}

	@Override
	public void createAdmin() {
		if(!toggleAdminClickInProgress) {
			toggleAdminClickInProgress = true;
		}
	}

}
