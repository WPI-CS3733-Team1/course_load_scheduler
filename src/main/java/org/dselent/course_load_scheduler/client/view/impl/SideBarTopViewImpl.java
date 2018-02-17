package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBarTopViewImpl extends Composite {

	private static SideBarTopViewImplUiBinder uiBinder = GWT.create(SideBarTopViewImplUiBinder.class);

	interface SideBarTopViewImplUiBinder extends UiBinder<Widget, SideBarTopViewImpl> {
	}

	public SideBarTopViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
