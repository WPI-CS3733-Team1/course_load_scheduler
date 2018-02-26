package org.dselent.course_load_scheduler.client.view.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.model.Section;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.CreateSectionView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class CreateSectionViewImpl extends BaseViewImpl<CreateSectionPresenter> implements CreateSectionView{

	private static CreateSectionViewImplUiBinder uiBinder = GWT.create(CreateSectionViewImplUiBinder.class);
	@UiField TextBox sectionExpectedPopulationTextBox;
	@UiField TextBox sectionYearTextBox;
	@UiField TextBox sectionTypeTextBox;
	@UiField TextBox sectionIdTextBox;
	@UiField TextBox sectionNameTextBox;
	@UiField Button createSectionButton;
	@UiField TextBox sectionTermTextBox;
	@UiField VerticalPanel createCourseVerticalPanel;
	@UiField ListBox sectionListBox;
	
	public TextBox getSectionRequiredFrequencyTextBox() {
		return sectionRequiredFrequencyTextBox;
	}


	public void setSectionRequiredFrequencyTextBox(TextBox sectionRequiredFrequencyTextBox) {
		this.sectionRequiredFrequencyTextBox = sectionRequiredFrequencyTextBox;
	}

	@UiField TextBox sectionStartTimeTextBox;
	@UiField TextBox sectionDaysOfTheWeek;
	@UiField TextBox sectionRequiredFrequencyTextBox;
	@UiField TextBox sectionCourseTextBox;
	@UiField TextBox sectionCourseNumberTextBox;
	@UiField TextBox sectionCourseNumberOfSectionsTextBox;
	@UiField Label sectionAvailableSectionsLabel;

	interface CreateSectionViewImplUiBinder extends UiBinder<Widget, CreateSectionViewImpl> {
	}

	public CreateSectionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	

	public static CreateSectionViewImplUiBinder getUiBinder() {
		return uiBinder;
	}


	public static void setUiBinder(CreateSectionViewImplUiBinder uiBinder) {
		CreateSectionViewImpl.uiBinder = uiBinder;
	}


	public VerticalPanel getSectionVerticalPanel() {
		return createCourseVerticalPanel;
	}
	
	public TextBox getSectionExpectedPopulationTextBox() {
		return sectionExpectedPopulationTextBox;
	}


	public void setSectionExpectedPopulationTextBox(TextBox sectionExpectedPopulationTextBox) {
		this.sectionExpectedPopulationTextBox = sectionExpectedPopulationTextBox;
	}


	public TextBox getSectionYearTextBox() {
		return sectionYearTextBox;
	}


	public void setSectionYearTextBox(TextBox sectionYearTextBox) {
		this.sectionYearTextBox = sectionYearTextBox;
	}


	public TextBox getSectionTypeTextBox() {
		return sectionTypeTextBox;
	}


	public void setSectionTypeTextBox(TextBox sectionTypeTextBox) {
		this.sectionTypeTextBox = sectionTypeTextBox;
	}


	public TextBox getSectionIdTextBox() {
		return sectionIdTextBox;
	}


	public void setSectionIdTextBox(TextBox sectionIdTextBox) {
		this.sectionIdTextBox = sectionIdTextBox;
	}


	public TextBox getSectionNameTextBox() {
		return sectionNameTextBox;
	}


	public void setSectionNameTextBox(TextBox sectionNameTextBox) {
		this.sectionNameTextBox = sectionNameTextBox;
	}


	public Button getCreateSectionButton() {
		return createSectionButton;
	}


	public void setCreateSectionButton(Button createSectionButton) {
		this.createSectionButton = createSectionButton;
	}


	public TextBox getSectionTermTextBox() {
		return sectionTermTextBox;
	}


	public void setSectionTermTextBox(TextBox sectionTermTextBox) {
		this.sectionTermTextBox = sectionTermTextBox;
	}


	public TextBox getSectionStartTimeTextBox() {
		return sectionStartTimeTextBox;
	}


	public void setSectionStartTimeTextBox(TextBox sectionStartTimeTextBox) {
		this.sectionStartTimeTextBox = sectionStartTimeTextBox;
	}


	public TextBox getSectionDaysOfTheWeek() {
		return sectionDaysOfTheWeek;
	}


	public void setSectionDaysOfTheWeek(TextBox sectionDaysOfTheWeek) {
		this.sectionDaysOfTheWeek = sectionDaysOfTheWeek;
	}


	public TextBox getSectionCourseTextBox() {
		return sectionCourseTextBox;
	}


	public void setSectionCourseTextBox(TextBox sectionCourseTextBox) {
		this.sectionCourseTextBox = sectionCourseTextBox;
	}


	public TextBox getSectionCourseNumberTextBox() {
		return sectionCourseNumberTextBox;
	}


	public void setSectionCourseNumberTextBox(TextBox sectionCourseNumberTextBox) {
		this.sectionCourseNumberTextBox = sectionCourseNumberTextBox;
	}


	public TextBox getSectionCourseNumberOfSectionsTextBox() {
		return sectionCourseNumberOfSectionsTextBox;
	}


	public void setSectionCourseNumberOfSectionsTextBox(TextBox sectionCourseNumberOfSectionsTextBox) {
		this.sectionCourseNumberOfSectionsTextBox = sectionCourseNumberOfSectionsTextBox;
	}


	public Label getSectionAvailableSectionsLabel() {
		return sectionAvailableSectionsLabel;
	}


	public void setSectionAvailableSectionsLabel(Label sectionAvailableSectionsLabel) {
		this.sectionAvailableSectionsLabel = sectionAvailableSectionsLabel;
	}


	@Override
	public void setPresenter(CreateSectionPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
	return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	public void showErrorMessages(String errorMesssages)
	{
		Window.alert(errorMesssages);
	}
	
	@UiHandler("createSectionButton")
	void onCreateSectionButtonClicked(ClickEvent evt)
	{
		presenter.createSection();
	}

	public void populateListBox(ArrayList<Section> sections)
	{
		for (int i = 0; i< sections.size(); i++) 
		{
			Section newSectionObject = sections.get(i);
			String sectionName = newSectionObject.getSectionName();
			sectionListBox.addItem(sectionName); 
		}
	}

	@Override
	public Button createSectionButton() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSectionButton(Button sectionButton) {
		this.createSectionButton = sectionButton;
		
	}
}
