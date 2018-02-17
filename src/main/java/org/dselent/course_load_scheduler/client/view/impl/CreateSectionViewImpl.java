package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class CreateSectionViewImpl extends Composite {

	private static CreateSectionViewImplUiBinder uiBinder = GWT.create(CreateSectionViewImplUiBinder.class);
	@UiField IntegerBox sectionExpectedPopulationIntBox;
	@UiField TextBox sectionYearTextBox;
	@UiField TextBox sectionTypeTextBox;
	@UiField TextBox sectionIdTextBox;
	@UiField TextBox sectionNameTextBox;
	@UiField Button createSectionButton;
	@UiField TextBox sectionTermTextBox;
	@UiField TextBox sectionStartTimeTextBox;
	@UiField TextBox sectionDaysOfTheWeek;
	@UiField TextBox sectionCourseTextBox;
	@UiField TextBox sectionCourseNumberTextBox;
	@UiField TextBox sectionCourseNumberOfSectionsTextBox;
	@UiField Label sectionAvailableSectionsLabel;

	interface CreateSectionViewImplUiBinder extends UiBinder<Widget, CreateSectionViewImpl> {
	}

	public CreateSectionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
