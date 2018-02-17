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
	private boolean aTermButtonClickInProgress = false;
	private boolean bTermButtonClickInProgress = false;
	private boolean cTermButtonClickInProgress = false;
	private boolean dTermButtonClickInProgress = false;
	private boolean scheduleButtonClickInProgress = false;
	private boolean searchButtonClickInProgress = false;
	public String userName = "dselent";
	
	@Override
	public void init() {
		bind();
	}
	
	@Inject
	public FacultyTopBarPresenterImpl(IndexPresenter parentPresenter, FacultyTopBarView view)
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
		if(!aTermButtonClickInProgress) {
			aTermButtonClickInProgress=true;
			view.getATerm().setEnabled(false);
			view.getBTerm().setEnabled(false);
			view.getCTerm().setEnabled(false);
			view.getDTerm().setEnabled(false);
			view.getSearch().setEnabled(false);
			view.getMySchedule().setEnabled(false);
			parentPresenter.showLoadScreen();
			openSchedule(userName, "a");
			
			
		}
		else if(!bTermButtonClickInProgress) {
			aTermButtonClickInProgress=true;
			view.getATerm().setEnabled(false);
			view.getBTerm().setEnabled(false);
			view.getCTerm().setEnabled(false);
			view.getDTerm().setEnabled(false);
			view.getSearch().setEnabled(false);
			view.getMySchedule().setEnabled(false);
			parentPresenter.showLoadScreen();
			openSchedule(userName, "b");			
		}
	}

	@Override
	public void openSchedule(String username, String term) 	{
		OpenScheduleAction osca = new OpenScheduleAction(userName, term);
		OpenScheduleEvent osce = new OpenScheduleEvent(osca);
		eventBus.fireEvent(osce);
	}

	@Override
	public void openSearch(String userName) 	{
		OpenSearchAction osa = new OpenSearchAction(userName);
		OpenSearchEvent ose = new OpenSearchEvent(osa);
		eventBus.fireEvent(ose);
	}
	
}
