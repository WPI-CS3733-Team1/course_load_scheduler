package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class SideBarViewImpl extends Composite {

	private static SideBarContainerImplUiBinder uiBinder = GWT.create(SideBarContainerImplUiBinder.class);

	interface SideBarContainerImplUiBinder extends UiBinder<Widget, SideBarViewImpl> {}
	
	@UiField
	DockLayoutPanel sideBarPanel;
	
	
	
	public SideBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
