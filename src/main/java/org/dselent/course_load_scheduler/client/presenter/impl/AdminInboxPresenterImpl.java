package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.InvalidOpenInboxAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.InvalidOpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendOpenInboxEvent;
import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.presenter.AdminInboxPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminInboxView;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminInboxPresenterImpl extends BasePresenterImpl implements AdminInboxPresenter{
	
	private IndexPresenter parentPresenter;
	private AdminInboxView view;
	private boolean openAdminInboxClickInProgress;
	
	@Inject
	public AdminInboxPresenterImpl(IndexPresenter parentPresenter, AdminInboxView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
	}
	
	@Override
	public void go(HasWidgets container) 
	{	
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AdminInboxView getView()
	{
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
	

	
//	public Message makeM1() {
//		Message m1 = new Message();
//		m1.setId(1000);
//		m1.setUserId(1000);
//		m1.setAuthorUserName("mtschmitt");
//		m1.setMessage("this is a test message");
//		m1.setResolved(false);
//		m1.setReceivedAt(null);
//		m1.setDeptId(6);
//		return m1;
//	}
//
//	public Message makeM2() {
//		Message m2 = new Message();
//		m2.setId(1001);
//		m2.setUserId(1001);
//		m2.setAuthorUserName("nparker");
//		m2.setMessage("this is a better test message bc im stupid");
//		m2.setResolved(false);
//		m2.setReceivedAt(null);
//		m2.setDeptId(6);
//		return m2;
//	}
//
//	public ArrayList<Message> makeLOM() {
//		ArrayList<Message> lom = new ArrayList<Message>();
//		lom.add(makeM1());
//		lom.add(makeM1());
//		return lom;
//		
//	}
	
	@Override
	public void onSendOpenInbox(SendOpenInboxEvent evt) {
		evt.getAction().getUserName();
	}
	
	public void onInvalidOpenInbox(InvalidOpenInboxEvent evt)
	{
		parentPresenter.hideLoadScreen();
		InvalidOpenInboxAction ila = evt.getAction();
		view.showErrorMessages(ila.toString());
	}

	@Override
	public void onOpenInbox(SendOpenInboxEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
//	void openAdminInbox() {
//		if (!openAdminInboxClickInProgress);
//		{
//			openAdminInboxClickInProgress = true;
//			
//			
//		}
//	}
	
}
