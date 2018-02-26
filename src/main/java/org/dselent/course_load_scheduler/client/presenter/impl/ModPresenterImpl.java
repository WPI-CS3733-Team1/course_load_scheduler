package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateAdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.CreateCourseView;
import org.dselent.course_load_scheduler.client.view.CreateSectionView;
import org.dselent.course_load_scheduler.client.view.CreateAdminView;
import org.dselent.course_load_scheduler.client.view.ModView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ModPresenterImpl extends BasePresenterImpl implements ModPresenter {

	IndexPresenter parentPresenter;
	ModView view;
	
	//private CreateCoursePresenterImpl createCoursePresenter;
	//private CreateSectionPresenterImpl createSectionPresenter;
	//private CreateAdminPresenterImpl createAdminPresenter;
	
	private SchedulePresenterImpl scheduleViewPresenter;
	private ModeratorTopBarPresenterImpl topBarPresenter;
	private SideBarPresenterImpl sidebarPresenter;
	Logger logger = java.util.logging.Logger.getLogger("[FacultyTopBarPresenter]");
	
	@Inject
	public ModPresenterImpl(IndexPresenter parent, ModView view, SchedulePresenterImpl schedulePresenterImpl, ModeratorTopBarPresenterImpl modTopPresenterImpl, SideBarPresenterImpl sidebarPresenter) {
		this.parentPresenter = parent;
		this.view = view;
		
		
		//this.createSectionPresenter = createSectionPresenter;
		//this.createCoursePresenter = createCoursePresenter;
		//this.createAdminPresenter = createAdminPresenter;
		
		this.scheduleViewPresenter = scheduleViewPresenter;
		this.topBarPresenter = modTopPresenterImpl;
		this.sidebarPresenter = sidebarPresenter;
		
		view.setPresenter(this);
		
		topBarPresenter.setView(view.getTopBarView());
		topBarPresenter.getView().setPresenter(topBarPresenter);
	}
	
	
	
	@Override
	public void init() {
		bind();
	}
	
	@Override
	public void bind() {
		
	}
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public ModView getView() {
		return view;
	}

	@Override
	public IndexPresenter getParentPresenter() {
		// TODO Auto-generated method stub
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}
	
	@Override
	public void onOpenCreateCourse(OpenCreateCourseEvent evt)
	{
		//view.getDockPanel().add(createCoursePresenter.getView().getCourseHorizontalPanel(), view.getDockPanel().CENTER);
	}
	
	@Override
	public void onOpenCreateSection(OpenCreateSectionEvent evt)
	{
		//view.getDockPanel().add(createSectionPresenter.getView().getSectionVerticalPanel(), view.getDockPanel().CENTER); 
	}
	
	@Override
	public void onOpenSearch(OpenSearchEvent evt) {
		logger.log(Level.SEVERE, "onOpenSearch triggered!");
	}
	
	@Override
	public void onOpenCreateAdmin(OpenCreateAdminEvent evt)
	{
		//view.getDockPanel().add(createAdminPresenter.getView().getAdminHorizontalPanel(), view.getDockPanel().CENTER);
	}

}
