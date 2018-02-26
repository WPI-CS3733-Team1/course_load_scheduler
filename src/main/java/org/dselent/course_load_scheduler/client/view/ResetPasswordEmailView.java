package org.dselent.course_load_scheduler.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface ResetPasswordEmailView extends BaseView<ResetPasswordEmailPresenter>{
	TextBox getResetPasswordEmailTextBox();
	void setResetPasswordEmailTextBox(TextBox resetPasswordEmailTextBox);
	Button getResetPasswordEmailButton();
	void setResetPasswordEmailButton(Button resetPasswordEmailButton);
	void showErrorMessages(String errorMessages);

	

}
