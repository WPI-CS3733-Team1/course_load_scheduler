package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.ModPresenter;
import org.dselent.course_load_scheduler.client.view.ModView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class ModViewImpl extends BaseViewImpl<ModPresenter> implements ModView {

	@UiField DockPanel modViewDockPanel;
	
	private static ModViewImplUiBinder uiBinder = GWT.create(ModViewImplUiBinder.class);

	interface ModViewImplUiBinder extends UiBinder<Widget, ModViewImpl> {
	}

	public ModViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	public ModViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(ModPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return null;
	}

	public DockPanel getDockPanel() {
		return modViewDockPanel;
	}
}
