package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.OpenInboxAction;
import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.event.OpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;

import com.google.gwt.user.client.ui.HasWidgets;

public class AdminTopBarPresenterImpl extends BasePresenterImpl implements AdminTopBarPresenter {

	private AdminTopBarPresenter parentPresenter;
	private AdminTopBarView view;
	
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
	public AdminTopBarView getView() {
		return view;
	}

	@Override
	public AdminTopBarPresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(AdminTopBarPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}

	@Override
	public void AdminTopBar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void openInbox(String username) 	{
		OpenInboxAction oia = new OpenInboxAction(username);
		OpenInboxEvent oie = new OpenInboxEvent(oia);
		eventBus.fireEvent(oie);
	}

	@Override
	public void openSearch(String username) 	{
		OpenSearchAction osa = new OpenSearchAction(username);
		OpenSearchEvent ose = new OpenSearchEvent(osa);
		eventBus.fireEvent(ose);
	}

	@Override
	public void openSchedule(String username, String term) 	{
		OpenScheduleAction osca = new OpenScheduleAction(username, term);
		OpenScheduleEvent osce = new OpenScheduleEvent(osca);
		eventBus.fireEvent(osce);
	}
}
