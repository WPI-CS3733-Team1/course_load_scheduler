package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;



public class FacultyTopBarViewImpl extends BaseViewImpl<FacultyTopBarPresenter> implements FacultyTopBarView {

	private static FacultyTopBarViewImplUiBinder uiBinder = GWT.create(FacultyTopBarViewImplUiBinder.class);
	
	

	interface FacultyTopBarViewImplUiBinder extends UiBinder<Widget, FacultyTopBarViewImpl> {
	}
	
	@UiField Button mySchedule;
	@UiField Button search;
	@UiField HorizontalPanel topBarFrame;
	@UiField Button aTerm;
	@UiField Button bTerm;
	@UiField Button cTerm;
	@UiField Button dTerm;
	@UiField HTMLPanel htmlPanel;
	String userName = "dselent";
	
	
	public FacultyTopBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Button getMySchedule() {
		return mySchedule;
	}

	@Override
	public Button getSearch() {
		return search;
	}

	@Override
	public Button getATerm() {
		return aTerm;
	}

	@Override
	public Button getBTerm() {
		return bTerm;
	}

	@Override
	public Button getCTerm() {
		return cTerm;
	}

	@Override
	public Button getDTerm() {
		return dTerm;
	}


	@UiHandler("mySchedule")
	void onMyScheduleClick(ClickEvent event) {
		presenter.openSchedule(userName, "A");
	}
	@UiHandler("aTerm")
	void onATermClick(ClickEvent event) {
		presenter.openSchedule(userName, "A");
	}
	@UiHandler("bTerm")
	void onBTermClick(ClickEvent event) {
		presenter.openSchedule(userName, "B");
	}
	@UiHandler("cTerm")
	void onCTermClick(ClickEvent event) {
		presenter.openSchedule(userName, "C");
	}
	@UiHandler("dTerm")
	void onDtermClick(ClickEvent event) {
		presenter.openSchedule(userName, "D");
		
	}
	@UiHandler("search")
	void onSearchClick(ClickEvent event) {
		presenter.openSearch(userName);
	}
	
	@Override
	public void setPresenter(FacultyTopBarPresenter presenter) {
		this.presenter = presenter;
	}
	
	@Override
	public Widget getWidgetContainer() {
		return this;
	}
	@Override
	public HasWidgets getViewRootPanel() {
		return htmlPanel;
	}

}