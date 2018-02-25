package org.dselent.course_load_scheduler.client.view.impl;

import java.util.HashMap;

import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

public class ScheduleViewImpl extends BaseViewImpl<SchedulePresenter> implements ScheduleView {

	private static ScheduleViewImplUiBinder uiBinder = GWT.create(ScheduleViewImplUiBinder.class);

	interface ScheduleViewImplUiBinder extends UiBinder<Widget, ScheduleViewImpl> {}

	public ScheduleViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	//define UI attributes here
	
	@UiField
	Grid grid;
	
	@UiField
	HTMLPanel htmlPanel;
	
	@UiField
	InlineLabel monday_8_9;
	@UiField
	InlineLabel tuesday_8_9;
	@UiField
	InlineLabel wednesday_8_9;
	@UiField
	InlineLabel thursday_8_9;
	@UiField
	InlineLabel friday_8_9;
	
	@UiField
	InlineLabel monday_9_10;
	@UiField
	InlineLabel tuesday_9_10;
	@UiField
	InlineLabel wednesday_9_10;
	@UiField
	InlineLabel thursday_9_10;
	@UiField
	InlineLabel friday_9_10;
	
	@UiField
	InlineLabel monday_10_11;
	@UiField
	InlineLabel tuesday_10_11;
	@UiField
	InlineLabel wednesday_10_11;
	@UiField
	InlineLabel thursday_10_11;
	@UiField
	InlineLabel friday_10_11;
	
	@UiField
	InlineLabel monday_11_12;
	@UiField
	InlineLabel tuesday_11_12;
	@UiField
	InlineLabel wednesday_11_12;
	@UiField
	InlineLabel thursday_11_12;
	@UiField
	InlineLabel friday_11_12;
	
	@UiField
	InlineLabel monday_12_1;
	@UiField
	InlineLabel tuesday_12_1;
	@UiField
	InlineLabel wednesday_12_1;
	@UiField
	InlineLabel thursday_12_1;
	@UiField
	InlineLabel friday_12_1;
	
	@UiField
	InlineLabel monday_1_2;
	@UiField
	InlineLabel tuesday_1_2;
	@UiField
	InlineLabel wednesday_1_2;
	@UiField
	InlineLabel thursday_1_2;
	@UiField
	InlineLabel friday_1_2;
	
	@UiField
	InlineLabel monday_2_3;
	@UiField
	InlineLabel tuesday_2_3;
	@UiField
	InlineLabel wednesday_2_3;
	@UiField
	InlineLabel thursday_2_3;
	@UiField
	InlineLabel friday_2_3;
	
	@UiField
	InlineLabel monday_3_4;
	@UiField
	InlineLabel tuesday_3_4;
	@UiField
	InlineLabel wednesday_3_4;
	@UiField
	InlineLabel thursday_3_4;
	@UiField
	InlineLabel friday_3_4;
	
	@UiField
	InlineLabel monday_4_5;
	@UiField
	InlineLabel tuesday_4_5;
	@UiField
	InlineLabel wednesday_4_5;
	@UiField
	InlineLabel thursday_4_5;
	@UiField
	InlineLabel friday_4_5;
	
	@UiField
	InlineLabel monday_5_6;
	@UiField
	InlineLabel tuesday_5_6;
	@UiField
	InlineLabel wednesday_5_6;
	@UiField
	InlineLabel thursday_5_6;
	@UiField
	InlineLabel friday_5_6;
	
	
	
	@UiHandler("monday_8_9")
	public void onClickLabel0(ClickEvent evt) {
		//registered anywhere else?
//		System.out.println(" has been clicked!!");
	}
	
	public HashMap<String, InlineLabel> getMondaySchedule() {
		HashMap<String, InlineLabel> mondaySchedule = new HashMap<String, InlineLabel>();
		mondaySchedule.put("8-9",monday_8_9);
		mondaySchedule.put("9-10",monday_9_10);
		mondaySchedule.put("10-11",monday_10_11);
		mondaySchedule.put("11-12",monday_11_12);
		mondaySchedule.put("12-1",monday_12_1);
		mondaySchedule.put("1-2",monday_1_2);
		mondaySchedule.put("2-3",monday_2_3);
		mondaySchedule.put("3-4",monday_3_4);
		mondaySchedule.put("4-5",monday_4_5);
		mondaySchedule.put("5-6",monday_5_6);
		
		return mondaySchedule;
	}

	public HashMap<String, InlineLabel> getTuesdaySchedule() {
		HashMap<String, InlineLabel> tuesdaySchedule = new HashMap<String, InlineLabel>();
		tuesdaySchedule.put("8-9",tuesday_8_9);
		tuesdaySchedule.put("9-10",tuesday_9_10);
		tuesdaySchedule.put("10-11",tuesday_10_11);
		tuesdaySchedule.put("11-12",tuesday_11_12);
		tuesdaySchedule.put("12-1",tuesday_12_1);
		tuesdaySchedule.put("1-2",tuesday_1_2);
		tuesdaySchedule.put("2-3",tuesday_2_3);
		tuesdaySchedule.put("3-4",tuesday_3_4);
		tuesdaySchedule.put("4-5",tuesday_4_5);
		tuesdaySchedule.put("5-6",tuesday_5_6);
		
		return tuesdaySchedule;
	}
	
	public HashMap<String, InlineLabel> getWednesdaySchedule() {
		HashMap<String, InlineLabel> wednesdaySchedule = new HashMap<String, InlineLabel>();
		wednesdaySchedule.put("8-9",wednesday_8_9);
		wednesdaySchedule.put("9-10",wednesday_9_10);
		wednesdaySchedule.put("10-11",wednesday_10_11);
		wednesdaySchedule.put("11-12",wednesday_11_12);
		wednesdaySchedule.put("12-1",wednesday_12_1);
		wednesdaySchedule.put("1-2",wednesday_1_2);
		wednesdaySchedule.put("2-3",wednesday_2_3);
		wednesdaySchedule.put("3-4",wednesday_3_4);
		wednesdaySchedule.put("4-5",wednesday_4_5);
		wednesdaySchedule.put("5-6",wednesday_5_6);
		
		return wednesdaySchedule;
	}
	
	public HashMap<String, InlineLabel> getThursdaySchedule() {
		HashMap<String, InlineLabel> thursdaySchedule = new HashMap<String, InlineLabel>();
		thursdaySchedule.put("8-9",thursday_8_9);
		thursdaySchedule.put("9-10",thursday_9_10);
		thursdaySchedule.put("10-11",thursday_10_11);
		thursdaySchedule.put("11-12",thursday_11_12);
		thursdaySchedule.put("12-1",thursday_12_1);
		thursdaySchedule.put("1-2",thursday_1_2);
		thursdaySchedule.put("2-3",thursday_2_3);
		thursdaySchedule.put("3-4",thursday_3_4);
		thursdaySchedule.put("4-5",thursday_4_5);
		thursdaySchedule.put("5-6",thursday_5_6);
		
		return thursdaySchedule;
	}
	
	public HashMap<String, InlineLabel> getFridaySchedule() {
		HashMap<String, InlineLabel> fridaySchedule = new HashMap<String, InlineLabel>();
		fridaySchedule.put("8-9",friday_8_9);
		fridaySchedule.put("9-10",friday_9_10);
		fridaySchedule.put("10-11",friday_10_11);
		fridaySchedule.put("11-12",friday_11_12);
		fridaySchedule.put("12-1",friday_12_1);
		fridaySchedule.put("1-2",friday_1_2);
		fridaySchedule.put("2-3",friday_2_3);
		fridaySchedule.put("3-4",friday_3_4);
		fridaySchedule.put("4-5",friday_4_5);
		fridaySchedule.put("5-6",friday_5_6);
		
		return fridaySchedule;
	}
	
	@Override
	public void setPresenter(SchedulePresenter presenter) {
		this.presenter = presenter;
	}
	
	
	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {		
		return htmlPanel; //return panel? is this okay?
	}
	
	public Grid getGrid() {
		return grid;
	}

	@Override
	public SchedulePresenter getPresenter() {
		return presenter;
	}
	
}
