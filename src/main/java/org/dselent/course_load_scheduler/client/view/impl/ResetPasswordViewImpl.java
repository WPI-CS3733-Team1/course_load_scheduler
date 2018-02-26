package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.ResetPasswordPresenter;
import org.dselent.course_load_scheduler.client.view.ResetPasswordView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ResetPasswordViewImpl extends BaseViewImpl<ResetPasswordPresenter> implements ResetPasswordView {

	private static ResetPasswordViewImplUiBinder uiBinder = GWT.create(ResetPasswordViewImplUiBinder.class);
	@UiField TextBox codeTextBox;
	@UiField TextBox newPassTextBox;
	@UiField TextBox confirmTextBox;
	@UiField Button confirmButton;
	@UiField VerticalPanel vertPanel;

	interface ResetPasswordViewImplUiBinder extends UiBinder<Widget, ResetPasswordViewImpl> {
	}

	public ResetPasswordViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setPresenter (ResetPasswordPresenter presenter)
	{
		this.presenter = presenter;
		
	}

	@Override
	public Widget getWidgetContainer() 
	{
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() 
	{
		return vertPanel;
	}

	@Override
	public void showErrorMessages(String errorMessages) {
		// TODO Auto-generated method stub
		
	}
	
	public void verifyCode()
	{
		//TODO
	}

}
