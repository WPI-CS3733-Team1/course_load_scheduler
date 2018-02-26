package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.ResetPasswordEmailPresenter;
import org.dselent.course_load_scheduler.client.view.ResetPasswordEmailView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Button;

public class ResetPasswordEmailViewImpl extends BaseViewImpl<ResetPasswordEmailPresenter> implements ResetPasswordEmailView {

	private static ResetPasswordEmailViewImplUiBinder uiBinder = GWT.create(ResetPasswordEmailViewImplUiBinder.class);
	@UiField TextBox resetPasswordEmailTextBox;
	@UiField Button resetPasswordEmailButton;
	@UiField VerticalPanel resetPasswordEmailPanel; 

	interface ResetPasswordEmailViewImplUiBinder extends UiBinder<Widget, ResetPasswordEmailViewImpl> {
	}

	public ResetPasswordEmailViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public TextBox getResetPasswordEmailTextBox()
	{
		return resetPasswordEmailTextBox;
	}
	
	@Override
	public void setResetPasswordEmailTextBox(TextBox resetPasswordEmailTextBox)
	{
		this.resetPasswordEmailTextBox = resetPasswordEmailTextBox;
	}
	
	@Override
	public Button getResetPasswordEmailButton()
	{
		return resetPasswordEmailButton;
	}
	@Override
	public void setResetPasswordEmailButton(Button resetPasswordEmailButton)
	{
		this.resetPasswordEmailButton = resetPasswordEmailButton;
	}
	
	@Override
	public void setPresenter(ResetPasswordEmailPresenter presenter)
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
		return resetPasswordEmailPanel;
	}
	
	@UiHandler("resetPasswordEmailButton")
	void onResetPasswordEmailButtonClicked(ClickEvent evt)
	{
		//presenter.login();
	}

	@Override
	public void showErrorMessages(String errorMessages) {
		// TODO Auto-generated method stub
		
	}
	
}
