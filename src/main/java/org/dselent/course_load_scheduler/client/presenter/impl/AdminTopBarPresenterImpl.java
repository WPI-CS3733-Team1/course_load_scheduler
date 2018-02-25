package org.dselent.course_load_scheduler.client.presenter.impl;

import javax.inject.Inject;

import org.dselent.course_load_scheduler.client.action.OpenInboxAction;
import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendOpenInboxAction;
import org.dselent.course_load_scheduler.client.event.OpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendOpenInboxEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.SideBarView;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;

import com.google.gwt.user.client.ui.HasWidgets;

public class AdminTopBarPresenterImpl extends BasePresenterImpl implements AdminTopBarPresenter {

	private AdminTopBarView view;
	private IndexPresenter parentPresenter;
	
	@Override
	public void init() {
		bind();
	}
	
	@Inject
	public AdminTopBarPresenterImpl(IndexPresenter parentPresenter, AdminTopBarView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
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
	public IndexPresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}

	@Override
	public void AdminTopBar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void openInbox(String username) 	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SendOpenInboxAction oia = new SendOpenInboxAction(username);
		SendOpenInboxEvent oie = new SendOpenInboxEvent(oia, container);
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
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		OpenScheduleAction osca = new OpenScheduleAction(username, term);
		OpenScheduleEvent osce = new OpenScheduleEvent(osca, container);
		eventBus.fireEvent(osce);
	}

	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {
		
	}
}
