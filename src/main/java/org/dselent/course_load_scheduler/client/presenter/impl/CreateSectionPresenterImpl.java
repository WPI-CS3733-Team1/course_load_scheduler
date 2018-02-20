package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.event.InvalidCreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.CreateSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CreateSectionView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CreateSectionPresenterImpl extends BasePresenterImpl implements CreateSectionPresenter {
	
	private IndexPresenter parentPresenter;
	private CreateSectionView view;
	private boolean createSectionClickInProgress;
	
	@Inject
	public CreateSectionPresenterImpl(IndexPresenter parentPresenter, CreateSectionView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		createSectionClickInProgress = false;
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidCreateSectionEvent.TYPE, this);
		//eventBusRegistration.put(InvalidCreateSectionEvent.TYPE, registration);
	}

	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}
	
	@Override
	public CreateSectionView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}
	
	@Override
	public void createSection()
	{
		if(!createSectionClickInProgress)
		{
			createSectionClickInProgress = true;
			view.createSectionButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			String sectionExpectedPopulation = view.getSectionExpectedPopulationTextBox().getText();
			String sectionYear = view.getSectionYearTextBox().getText();
			String sectionType = view.getSectionTypeTextBox().getText();
			String sectionId = view.getSectionIdTextBox().getText();
			String sectionName = view.getSectionNameTextBox().getText();
			String sectionStartTime = view.getSectionStartTimeTextBox().getText();
			String sectionDaysOfTheWeek = view.getSectionDaysOfTheWeek().getText();
			String sectionRequiredFrequency = view.getSectionRequiredFrequencyTextBox().getText();
			String sectionCourse = view.getSectionCourseTextBox().getText();
			String sectionCourseNumberOfSections = view.getSectionCourseNumberOfSectionsTextBox().getText();
			String sectionTerm = view.getSectionTermTextBox().getText();
			
			boolean validSectionExpectedPopulation = true;
			
		}
		
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {
		// TODO Auto-generated method stub
		
	}
}
