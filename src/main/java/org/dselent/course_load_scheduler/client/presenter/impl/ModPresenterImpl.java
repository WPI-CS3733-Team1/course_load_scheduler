package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateSectionEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
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
	private CreateCourseView createCourseView;
	private CreateSectionView createSectionView;
	private CreateAdminView createAdminView;
	
	@Inject
	public ModPresenterImpl(IndexPresenter parent, ModView view, CreateSectionView createSectionView, CreateCourseView createCourseView, CreateAdminView createAdminView) {
		this.parentPresenter = parent;
		this.view = view;
		this.createSectionView = createSectionView;
		this.createCourseView = createCourseView;
		this.createAdminView = createAdminView;
		view.setPresenter(this);
		//createSectionView.setParentPresenter(this);
		//createCourseView.setParentPresenter(this);
		
		
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
		view.getDockPanel().add(createCourseView.getCourseHorizontalPanel(), view.getDockPanel().CENTER);
	}
	
	@Override
	public void onOpenCreateSection(OpenCreateSectionEvent evt)
	{
		view.getDockPanel().add(createSectionView.getSectionVerticalPanel(), view.getDockPanel().CENTER); 
	}
	
	@Override
	public void onOpenCreateAdmin(OpenCreateAdminEvent evt)
	{
		view.getDockPanel().add(createAdminView.getAdminHorizontalPanel(), view.getDockPanel().CENTER);
	}

}
