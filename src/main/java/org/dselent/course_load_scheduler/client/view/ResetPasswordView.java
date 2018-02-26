package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.ResetPasswordPresenter;

public interface ResetPasswordView extends BaseView<ResetPasswordPresenter> 
{
void showErrorMessages(String errorMessages);
}
