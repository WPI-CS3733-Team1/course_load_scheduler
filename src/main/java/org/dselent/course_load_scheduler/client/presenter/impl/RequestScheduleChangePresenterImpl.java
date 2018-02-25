package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendMessageAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidLoginStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidScheduleChangeStrings;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendMessageEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.RequestScheduleChangePresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.RequestScheduleChangeView;

import com.google.gwt.user.client.ui.HasWidgets;

public class RequestScheduleChangePresenterImpl extends BasePresenterImpl implements RequestScheduleChangePresenter {

	private RequestScheduleChangeView view;
	private IndexPresenter parentPresenter;
	private String userName = "username"; //placeholder until we can determine global variables
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());		
	}

	@Override
	public RequestScheduleChangeView getView() {
		// TODO Auto-generated method stub
		return view;
	}

	@Override
	public void requestScheduleChange() {
		String message = view.getScheduleChangeBody().getText();
		
		Boolean sendMessage = true;
		
		List<String> invalidReasonList = new ArrayList<>();
		
		try
		{
			checkEmptyString(message);
		}
		catch(EmptyStringException e)
		{
			invalidReasonList.add(InvalidScheduleChangeStrings.NULL_MESSAGE);
			sendMessage = false;
		}
		
		if(sendMessage) {
			sendMessageToAdmin(userName, message);
		}
		else {
			displayErrorMessage();
		}
		
	}
	
	private void displayErrorMessage() {
		//TODO
		
	}

	private void sendMessageToAdmin(String userName, String message) {
			HasWidgets container = parentPresenter.getView().getViewRootPanel();
			SendMessageAction sma = new SendMessageAction(userName, message);
			SendMessageEvent sme = new SendMessageEvent(sma, container);
			eventBus.fireEvent(sme);
		}

	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}

}
