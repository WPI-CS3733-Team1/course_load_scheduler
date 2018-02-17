package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModeratorTopBarPresenter;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;
import org.dselent.course_load_scheduler.client.view.ModeratorTopBarView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class ModeratorTopBarViewImpl extends BaseViewImpl<ModeratorTopBarPresenter> implements ModeratorTopBarView {

	private static ModeratorTopBarViewImplUiBinder uiBinder = GWT.create(ModeratorTopBarViewImplUiBinder.class);

	interface ModeratorTopBarViewImplUiBinder extends UiBinder<Widget, ModeratorTopBarViewImpl> {
	}
	
	@UiField Button createCourse;
	@UiField Button search;
	@UiField Button createAdmin;
	String userName = "moderator1";
	
	public ModeratorTopBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("search")
	void onSearchClick(ClickEvent event) {
		presenter.openSearch(userName);
	}
	
	@UiHandler("createCourse")
	void onCreateCourseClick(ClickEvent e) {
		presenter.openCreateCourse(userName);
	}
	
	@UiHandler("createAdmin")
	void onCreateAdminClick(ClickEvent e) {
		presenter.openCreateAdmin(userName);
	}

	@Override
	public Button getCreateAdmin() {
		return createAdmin;
	}
	
	@Override
	public Button getCreateCourse() {
		return createCourse;
	}
	
	@Override
	public Button getSearch() {
	return search;
	}
	
	@Override
	public void setPresenter(ModeratorTopBarPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget getWidgetContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}
}
