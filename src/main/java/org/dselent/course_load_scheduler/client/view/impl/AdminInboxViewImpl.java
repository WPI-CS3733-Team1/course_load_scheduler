package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.Message;
import org.dselent.course_load_scheduler.client.presenter.AdminInboxPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.view.AdminInboxView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.TextBox;

public class AdminInboxViewImpl extends BaseViewImpl<AdminInboxPresenter> implements AdminInboxView {

	private static AdminInboxViewImplUiBinder uiBinder = GWT.create(AdminInboxViewImplUiBinder.class);
	@UiField ScrollPanel scrollPanel;
	@UiField Grid gridPanel;


	interface AdminInboxViewImplUiBinder extends UiBinder<Widget, AdminInboxViewImpl> {
	}

	public AdminInboxViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(AdminInboxPresenter presenter) {
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
	
	public void populateTable(ArrayList<Message> adminInboxInfo) 
	{
		for (int i = 0; i < adminInboxInfo.size() ; i++) 
		{
			Message newMessageObject = adminInboxInfo.get(i);
			String newUser = newMessageObject.getAuthorUserName();
			String newMessage = newMessageObject.getMessage();
			
			gridPanel.add(new AdminInboxRowViewImpl(newUser, newMessage));
		}
	}
	

}
