package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBarFacultyBottomImpl extends Composite {

	private static SideBarFacultyBottomImplUiBinder uiBinder = GWT.create(SideBarFacultyBottomImplUiBinder.class);

	interface SideBarFacultyBottomImplUiBinder extends UiBinder<Widget, SideBarFacultyBottomImpl> {
	}

	public SideBarFacultyBottomImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
