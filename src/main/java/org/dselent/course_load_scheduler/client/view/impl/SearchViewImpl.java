package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SearchPresenter;
import org.dselent.course_load_scheduler.client.view.SearchView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class SearchViewImpl extends BaseViewImpl<SearchPresenter> implements SearchView {

	private static SearchViewImplUiBinder uiBinder = GWT.create(SearchViewImplUiBinder.class);

	interface SearchViewImplUiBinder extends UiBinder<Widget, SearchViewImpl> {
	}
	
	@UiField
	VerticalPanel search_panel;
	
	@UiField
	RadioButton users_button;
	
	@UiField
	RadioButton courses_button;
	
	@UiField
	TextBox dept_box;
	
	@UiField
	Button submit_button;
	
	public SearchViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(SearchPresenter presenter) {

		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		
		return search_panel;
	}

	@Override
	public RadioButton getUsersRadioButton() {
		
		return users_button;
	}

	@Override
	public void setUsersRadioButton(RadioButton usersRadioButton) {
		
		this.users_button = usersRadioButton;
	}

	@Override
	public RadioButton getCoursesRadioButton() {
		
		return courses_button;
	}

	@Override
	public void setCoursesRadioButton(RadioButton coursesRadioButton) {
		
		this.courses_button = coursesRadioButton;
	}

	@Override
	public TextBox getDeptIDTextBox() {
		
		return dept_box;
	}

	@Override
	public void setDeptIDTextBox(TextBox nameTextBox) {
		
		this.dept_box = nameTextBox;
	}
	
	@Override
	public Button getSubmitButton() {
		return submit_button;
	}
	
	@Override
	public void setSubmitButton(Button submitButton) {
		this.submit_button = submitButton;
	}

	@Override
	public SearchPresenter getPresenter() {
		return presenter;
	}

}
