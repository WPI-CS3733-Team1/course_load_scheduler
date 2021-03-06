package org.dselent.course_load_scheduler.client.view.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

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
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class ModeratorTopBarViewImpl extends BaseViewImpl<ModeratorTopBarPresenter> implements ModeratorTopBarView {

	private static ModeratorTopBarViewImplUiBinder uiBinder = GWT.create(ModeratorTopBarViewImplUiBinder.class);

	interface ModeratorTopBarViewImplUiBinder extends UiBinder<Widget, ModeratorTopBarViewImpl> {
	}
	
	@UiField HorizontalPanel topBarFrame;
	@UiField Button createCourse;
	@UiField Button search;
	@UiField Button createAdmin;
	String userName = "moderator1";
	Logger logger = java.util.logging.Logger.getLogger("[FacultyTopBarPresenter]");
	
	public ModeratorTopBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("search")
	void onSearchClick(ClickEvent event) {
		logger.log(Level.SEVERE, "onSearchClick called!");
		presenter.openSearch(userName);
	}
	
	@UiHandler("createCourse")
	void onCreateCourseClick(ClickEvent e) {
		presenter.openCreateCourse(userName);
	}
	
	@UiHandler("createSection")
	void onCreateSectionLink(ClickEvent e) {
		presenter.openCreateSection(userName);
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
		this.presenter = presenter;	
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return topBarFrame;
	}
}
