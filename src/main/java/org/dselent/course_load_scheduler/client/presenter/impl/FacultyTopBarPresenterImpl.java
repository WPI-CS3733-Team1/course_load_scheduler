package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class FacultyTopBarPresenterImpl extends BasePresenterImpl implements FacultyTopBarPresenter {

	private IndexPresenter parentPresenter;
	private FacultyTopBarView view;
	public String userName = "dselent";
	
	@Inject
	public FacultyTopBarPresenterImpl(IndexPresenter parentPresenter, FacultyTopBarView view)
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
	public void bind() {
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(OpenSearchEvent.TYPE, this);
		eventBusRegistration.put(OpenSearchEvent.TYPE, registration);
		
		HandlerRegistration reg;
		reg = eventBus.addHandler(OpenScheduleEvent.TYPE, this);
		eventBusRegistration.put(OpenScheduleEvent.TYPE, reg);
	}

	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public FacultyTopBarView getView() {
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
	public void FacultyTopBar() {
	}

	@Override
	public void openSchedule(String username, String term) 	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel(); //this might have to change to be the specific DockPanel CENTER panel
		OpenScheduleAction osca = new OpenScheduleAction(userName, term);
		OpenScheduleEvent osce = new OpenScheduleEvent(osca, container);
		eventBus.fireEvent(osce); //how is this going to connect to schedulePresenter/scheduleView?
	}

	@Override
	public void openSearch(String userName) 	{
		OpenSearchAction osa = new OpenSearchAction(userName);
		OpenSearchEvent ose = new OpenSearchEvent(osa);
		eventBus.fireEvent(ose);
	} 
	
}
