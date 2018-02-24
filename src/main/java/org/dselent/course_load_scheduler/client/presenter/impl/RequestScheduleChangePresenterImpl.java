package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidLoginStrings;
import org.dselent.course_load_scheduler.client.errorstring.InvalidScheduleChangeStrings;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.RequestScheduleChangePresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.RequestScheduleChangeView;

import com.google.gwt.user.client.ui.HasWidgets;

public class RequestScheduleChangePresenterImpl extends BasePresenterImpl implements RequestScheduleChangePresenter {

	private RequestScheduleChangeView view;
	
	
	
	
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
			sendMessageToAdmin(message);
		}
		else {
			displayErrorMessage();
		}
		
	}
	
	private void displayErrorMessage() {
		//TODO
		
	}

	private void sendMessageToAdmin(String message) {
		// TODO Auto-generated method stub
		
	}

	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}

}
