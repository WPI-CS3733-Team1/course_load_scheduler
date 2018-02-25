package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface FacultyTopBarView extends BaseView<FacultyTopBarPresenter> {

	Button getATerm();
	Button getBTerm();
	Button getCTerm();
	Button getDTerm();
	Button getSearch();
	Button getMySchedule();
	FacultyTopBarPresenter getPresenter();
}
