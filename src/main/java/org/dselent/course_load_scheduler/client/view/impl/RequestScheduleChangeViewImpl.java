package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.RequestScheduleChangePresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
import org.dselent.course_load_scheduler.client.view.RequestScheduleChangeView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyMiddleView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class RequestScheduleChangeViewImpl extends BaseViewImpl<RequestScheduleChangePresenter> implements RequestScheduleChangeView {

	private static RequestScheduleChangeViewImplUiBinder uiBinder = GWT
			.create(RequestScheduleChangeViewImplUiBinder.class);

	interface RequestScheduleChangeViewImplUiBinder extends UiBinder<Widget, RequestScheduleChangeViewImpl> {
	}

	public RequestScheduleChangeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Button requestScheduleChangeButton;
	@UiField TextArea scheduleChangeBody;
	@UiField Label successConfirmation;
	@UiField HTMLPanel requestScheduleChangeViewPanel;
	
	
	public Button getRequestScheduleChangeButton() {
		return requestScheduleChangeButton;
	}
	public void setRequestScheduleChangeButton(Button requestScheduleChangeButton) {
		this.requestScheduleChangeButton = requestScheduleChangeButton;
	}
	public TextArea getScheduleChangeBody() {
		return scheduleChangeBody;
	}
	public void setScheduleChangeBody(TextArea scheduleChangeBody) {
		this.scheduleChangeBody = scheduleChangeBody;
	}
	public Label getSuccessConfirmation() {
		return successConfirmation;
	}
	public void setSuccessConfirmation(Label successConfirmation) {
		this.successConfirmation = successConfirmation;
	}
	@Override
	public void setPresenter(RequestScheduleChangePresenter presenter) {
		this.presenter = presenter;
		
	}
	@Override
	public Widget getWidgetContainer() {
		return this;
	}
	@Override
	public HasWidgets getViewRootPanel() {
		return requestScheduleChangeViewPanel;
	}
	
	@UiHandler("requestScheduleChangeButton")
	void onRequestScheduleChangeButtonClicked(ClickEvent evt)
	{
		presenter.requestScheduleChange();
	}
	
	
	
	
	

}
