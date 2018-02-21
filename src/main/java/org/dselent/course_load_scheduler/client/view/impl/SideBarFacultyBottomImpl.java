package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.view.SideBarFacultyBottomView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SideBarFacultyBottomImpl extends Composite implements SideBarFacultyBottomView{

	private static SideBarFacultyBottomImplUiBinder uiBinder = GWT.create(SideBarFacultyBottomImplUiBinder.class);

	interface SideBarFacultyBottomImplUiBinder extends UiBinder<Widget, SideBarFacultyBottomImpl> {
	}

	public SideBarFacultyBottomImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Label course1;
	@UiField Label course2;
	@UiField Label course3;
	@UiField Label course4;
	@UiField Label course5;
	
	public Label getCourse1() {
		return course1;
	}
	public void setCourse1(Label course1) {
		this.course1 = course1;
	}
	public Label getCourse2() {
		return course2;
	}
	public void setCourse2(Label course2) {
		this.course2 = course2;
	}
	public Label getCourse3() {
		return course3;
	}
	public void setCourse3(Label course3) {
		this.course3 = course3;
	}
	public Label getCourse4() {
		return course4;
	}
	public void setCourse4(Label course4) {
		this.course4 = course4;
	}
	public Label getCourse5() {
		return course5;
	}
	public void setCourse5(Label course5) {
		this.course5 = course5;
	}
	
}
