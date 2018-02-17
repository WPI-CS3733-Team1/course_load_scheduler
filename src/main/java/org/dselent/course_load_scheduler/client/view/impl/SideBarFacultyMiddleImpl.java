package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBarFacultyMiddleImpl extends Composite {

	private static SideBarFacultyMiddleImplUiBinder uiBinder = GWT.create(SideBarFacultyMiddleImplUiBinder.class);

	interface SideBarFacultyMiddleImplUiBinder extends UiBinder<Widget, SideBarFacultyMiddleImpl> {
	}

	public SideBarFacultyMiddleImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
