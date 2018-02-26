package org.dselent.course_load_scheduler.client.view.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dselent.course_load_scheduler.client.gin.Injector;
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
	
	interface FacultyTopBarViewImplUiBinder extends UiBinder<Widget, FacultyTopBarViewImpl> {}
	
	@UiField Button mySchedule;
	@UiField Button search;
	@UiField HorizontalPanel topBarFrame;
	@UiField Button aTerm;
	@UiField Button bTerm;
	@UiField Button cTerm;
	@UiField Button dTerm;
	@UiField HTMLPanel htmlPanel;
	Logger logger = java.util.logging.Logger.getLogger("[FacultyTopBarPresenter]");
	
	
	public FacultyTopBarViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public HorizontalPanel getTopBarFrame() {
		return topBarFrame;
	}

	public void setTopBarFrame(HorizontalPanel topBarFrame) {
		this.topBarFrame = topBarFrame;
	}

	public Button getaTerm() {
		return aTerm;
	}

	public void setaTerm(Button aTerm) {
		this.aTerm = aTerm;
	}

	public Button getbTerm() {
		return bTerm;
	}

	public void setbTerm(Button bTerm) {
		this.bTerm = bTerm;
	}

	public Button getcTerm() {
		return cTerm;
	}

	public void setcTerm(Button cTerm) {
		this.cTerm = cTerm;
	}

	public Button getdTerm() {
		return dTerm;
	}

	public void setdTerm(Button dTerm) {
		this.dTerm = dTerm;
	}

	public HTMLPanel getHtmlPanel() {
		return htmlPanel;
	}

	public void setHtmlPanel(HTMLPanel htmlPanel) {
		this.htmlPanel = htmlPanel;
	}

	public void setMySchedule(Button mySchedule) {
		this.mySchedule = mySchedule;
	}

	public void setSearch(Button search) {
		this.search = search;
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
		presenter.openSchedule("dselent", "A");
	}
	@UiHandler("aTerm")
	void onATermClick(ClickEvent event) {
		//
		presenter.openSchedule("dselent", "A");
	}
	@UiHandler("bTerm")
	void onBTermClick(ClickEvent event) {
		presenter.openSchedule("dselent", "B");
	}
	@UiHandler("cTerm")
	void onCTermClick(ClickEvent event) {
		presenter.openSchedule("dselent", "C");
	}
	
	@UiHandler("dTerm")
	void onDtermClick(ClickEvent event) {
		presenter.openSchedule("dselent", "D");
	}
	
	@UiHandler("search")
	void onSearchClick(ClickEvent event) {
		//alert("onSearchClick!!!");
		logger.log(Level.FINE, "onSearchClick()!");
		if(presenter == null) {
			logger.log(Level.SEVERE, "Presenter was null!");
		}
		presenter.openSearch();
	}
	
	@Override
	public void setPresenter(FacultyTopBarPresenter presenter) {
		logger.log(Level.SEVERE, "Presenter set!"); //this is never getting called
		this.presenter = presenter;
	}
	
	@Override
	public FacultyTopBarPresenter getPresenter() {
		return presenter;
	}
	
	@Override
	public Widget getWidgetContainer() {
		return this;
	}
	@Override
	public HasWidgets getViewRootPanel() {
		return htmlPanel;
	}

	public static native void alert(String msg) /*-{
	  $wnd.alert(msg);
	}-*/;
}