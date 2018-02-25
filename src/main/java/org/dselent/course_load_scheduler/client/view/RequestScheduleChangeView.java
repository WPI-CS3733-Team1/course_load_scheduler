package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.RequestScheduleChangePresenter;

import com.google.gwt.user.client.ui.TextArea;

public interface RequestScheduleChangeView extends BaseView<RequestScheduleChangePresenter>{
	
	TextArea getScheduleChangeBody();
	

}
