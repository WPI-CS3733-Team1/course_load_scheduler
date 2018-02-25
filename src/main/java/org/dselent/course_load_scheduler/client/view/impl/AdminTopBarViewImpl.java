package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HTMLPanel;

public class AdminTopBarViewImpl extends BaseViewImpl<AdminTopBarPresenter> implements AdminTopBarView {

	private static AdminTopBarViewImplUiBinder uiBinder = GWT.create(AdminTopBarViewImplUiBinder.class);
	@UiField Button inboxButton;
	@UiField Button scheduler;
	@UiField Button aTerm;
	@UiField Button bTerm;
	@UiField Button cTerm;
	@UiField Button dTerm;
	@UiField HTMLPanel htmlPanel;
	String adminUserName = "admin1";

	interface AdminTopBarViewImplUiBinder extends UiBinder<Widget, AdminTopBarViewImpl> {
	}

	public AdminTopBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("inboxButton")
	void onInboxButtonClick(ClickEvent event) {
		presenter.openInbox(adminUserName);
	}
	@UiHandler("scheduler")
	void onMyScheduleClick(ClickEvent event) {
		presenter.openSchedule(adminUserName, "A");
	}
	@UiHandler("search")
	void onSearchClick(ClickEvent event) {
		presenter.openSearch(adminUserName);
	}
	@UiHandler("dTerm")
	void onDTermClick(ClickEvent event) {
		presenter.openSchedule(adminUserName, "D");
	}
	@UiHandler("cTerm")
	void onCTermClick(ClickEvent event) {
		presenter.openSchedule(adminUserName, "C");
	}
	@UiHandler("bTerm")
	void onBTermClick(ClickEvent event) {
		presenter.openSchedule(adminUserName, "B");
	}
	@UiHandler("aTerm")
	void onATermClick(ClickEvent event) {
		presenter.openSchedule(adminUserName, "A");
	}

	@Override
	public Button getInboxButton() {
		return inboxButton;
	}
	
	@Override
	public Button getScheduler() {
		return scheduler;
	}

	@Override
	public Button getATerm() {
		return aTerm;
	}

	@Override
	public Button getBTerm() {
		return bTerm;
	}

	@Override
	public Button getCTerm() {
		return cTerm;
	}

	@Override
	public void setPresenter(AdminTopBarPresenter presenter) {
		this.presenter = presenter;		
	}

	@Override
	public Button getDterm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return htmlPanel;
	}


	
	
}
