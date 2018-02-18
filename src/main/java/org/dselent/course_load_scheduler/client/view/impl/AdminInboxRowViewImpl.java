package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;


public class AdminInboxRowViewImpl extends Composite {

	private static AdminInboxRowImplUiBinder uiBinder = GWT.create(AdminInboxRowImplUiBinder.class);
	
	
	interface AdminInboxRowImplUiBinder extends UiBinder<Widget, AdminInboxRowViewImpl> {
	}

	public AdminInboxRowViewImpl(String username, String message) {
		initWidget(uiBinder.createAndBindUi(this));  
	}
	
}
