package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class ScheduleViewImpl extends BaseViewImpl<SchedulePresenter> implements ScheduleView {

	private static ScheduleViewImplUiBinder uiBinder = GWT.create(ScheduleViewImplUiBinder.class);

	interface ScheduleViewImplUiBinder extends UiBinder<Widget, ScheduleViewImpl> {}

	public ScheduleViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	//define UI attributes here
	
	@UiField
	Grid grid;
	
	
	@UiField
	Label label1;
	
	@UiField
	Label label2;

	@UiField
	Label label3;
	
	@UiField
	Label label4;

	@UiField
	HTMLPanel htmlPanel;
	
	@UiHandler("label0")
	public void onClickLabel0(ClickEvent evt) {
		//registered anywhere else?
		System.out.println("label0 has been clicked!!");
	}
	
	@Override
	public void setPresenter(SchedulePresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {		
		return htmlPanel; //return panel? is this okay?
	}
	
	public Grid getGrid() {
		return grid;
	}

	public Label getLabel1() {
		return label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public Label getLabel4() {
		return label4;
	}

}
