package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.ModeratorTopBarPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface ModeratorTopBarView extends BaseView<ModeratorTopBarPresenter> {
	Button getCreateAdmin();
	Button getCreateCourse();
	Button getSearch();	
	
}
