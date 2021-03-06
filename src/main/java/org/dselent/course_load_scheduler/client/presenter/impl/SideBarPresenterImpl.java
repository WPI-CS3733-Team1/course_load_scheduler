package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.OpenScheduleAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendOpenScheduleChangeRequestAction;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendOpenScheduleChangeRequestEvent;
import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyBottomView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyMiddleView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyTopView;
import org.dselent.course_load_scheduler.client.view.SideBarView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class SideBarPresenterImpl extends BasePresenterImpl implements SideBarPresenter {

	private FacultyPresenter parentPresenter;
	private SideBarView view;
	private SideBarFacultyTopView topView;
	private SideBarFacultyMiddleView middleView;
	private SideBarFacultyBottomView bottomView;
	private String userName = "username";

	@Inject
	public SideBarPresenterImpl(SideBarView view, SideBarFacultyTopView topView, SideBarFacultyMiddleView middleView, SideBarFacultyBottomView bottomView)
	{
		this.view = view;
		this.topView = topView;
		this.middleView = middleView;
		this.bottomView = bottomView;
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
	public SideBarView getView() {
		return view;
	}

	@Override
	public void bind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind() {
		// TODO Auto-generated method stub
		
	}

	@Override

	public FacultyPresenter getParentPresenter() {
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(FacultyPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;

	}

	@Override
	public void openRequestScheduleChange() 	
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SendOpenScheduleChangeRequestAction sla = new SendOpenScheduleChangeRequestAction(userName);
		SendOpenScheduleChangeRequestEvent sle = new SendOpenScheduleChangeRequestEvent(sla, container);
		eventBus.fireEvent(sle);
	}
	
	@Override
	public void openSchedule(String userName, String term) 	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel(); //this might have to change to be the specific DockPanel CENTER panel
		OpenScheduleAction sosca = new OpenScheduleAction(userName, term);
		OpenScheduleEvent sosce = new OpenScheduleEvent(sosca, container);
		eventBus.fireEvent(sosce); //how is this going to connect to schedulePresenter/scheduleView?
	}

}
