package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.ModeratorTopBarPresenter;
import org.dselent.course_load_scheduler.client.action.OpenCreateAdminAction;
import org.dselent.course_load_scheduler.client.action.OpenCreateCourseAction;
import org.dselent.course_load_scheduler.client.action.OpenSearchAction;
import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.ModeratorTopBarView;
import org.dselent.course_load_scheduler.client.view.SideBarView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ModeratorTopBarPresenterImpl extends BasePresenterImpl implements ModeratorTopBarPresenter {

	private IndexPresenter parentPresenter;
	private ModeratorTopBarView view;
	
	@Inject
	public ModeratorTopBarPresenterImpl(IndexPresenter parentPresenter, ModeratorTopBarView view)
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
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public ModeratorTopBarView getView() {
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
	public void ModeratorTopBar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void openCreateAdmin(String userName) {
		OpenCreateAdminAction ocaa = new OpenCreateAdminAction(userName);
		OpenCreateAdminEvent ocae = new OpenCreateAdminEvent(ocaa);
		eventBus.fireEvent(ocae);
	}

	@Override
	public void openCreateCourse(String userName) {
		OpenCreateCourseAction occa = new OpenCreateCourseAction(userName);
		OpenCreateCourseEvent occe = new OpenCreateCourseEvent(occa);
		eventBus.fireEvent(occe);
	}

	@Override
	public void openSearch(String username) 	{
		OpenSearchAction osa = new OpenSearchAction(username);
		OpenSearchEvent ose = new OpenSearchEvent(osa);
		eventBus.fireEvent(ose);
	}
}