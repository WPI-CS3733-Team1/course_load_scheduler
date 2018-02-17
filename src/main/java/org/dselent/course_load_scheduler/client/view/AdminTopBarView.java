package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface AdminTopBarView extends BaseView<AdminTopBarPresenter> {
	Button getATerm();
	Button getBTerm();
	Button getCTerm();
	Button getDterm();
	Button getScheduler();
	Button getInboxButton();
	
}
