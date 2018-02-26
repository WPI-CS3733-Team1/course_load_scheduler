package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface FacultyTopBarView extends BaseView<FacultyTopBarPresenter> {

	public Button getATerm();
	public Button getBTerm();
	public Button getCTerm();
	public Button getDTerm();
	public Button getSearch();
	public Button getMySchedule();
	public FacultyTopBarPresenter getPresenter();

}
