package org.dselent.course_load_scheduler.client.view;

import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

import org.dselent.course_load_scheduler.client.presenter.CreateSectionPresenter;

public interface CreateSectionView extends BaseView<CreateSectionPresenter> {
	  TextBox getSectionExpectedPopulationTextBox();
	  void setSectionExpectedPopulationTextBox(TextBox sectionExpectedPopulationTextBox);
	  TextBox getSectionYearTextBox();
	  void setSectionYearTextBox(TextBox sectionYearTextBox);
	  TextBox getSectionTypeTextBox();
	  void setSectionTypeTextBox(TextBox sectionTypeTextBox);
	  TextBox getSectionIdTextBox();
	  void setSectionIdTextBox(TextBox sectionIdTextBox);
	  TextBox getSectionNameTextBox();
	  void setSectionNameTextBox(TextBox sectionNameTextBox);
	  Button createSectionButton();
	  void setSectionButton(Button sectionButton);
	  TextBox getSectionStartTimeTextBox();
	  void setSectionStartTimeTextBox(TextBox sectionStartTime);
	  TextBox getSectionDaysOfTheWeek();
	  void setSectionDaysOfTheWeek(TextBox sectionDaysOfTheWeek);
	  TextBox getSectionRequiredFrequencyTextBox();
	  void setSectionRequiredFrequencyTextBox(TextBox sectionRequiredFrequency);
	  TextBox getSectionCourseTextBox();
	  void setSectionCourseTextBox(TextBox sectionCourseTextBox);
	  TextBox getSectionCourseNumberTextBox();
	  void setSectionCourseNumberTextBox(TextBox sectionCourseNumber);
	  TextBox getSectionCourseNumberOfSectionsTextBox();
	  void setSectionCourseNumberOfSectionsTextBox(TextBox sectionCourseNumberOfSectionsTextBox);
	  Label getSectionAvailableSectionsLabel();
	  void setSectionAvailableSectionsLabel(Label sectionAvailableSectionsLabel);
	  TextBox getSectionTermTextBox();
	  void setSectionTermTextBox(TextBox sectionTermTextBox);

}
