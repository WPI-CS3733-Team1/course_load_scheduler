package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateAdminEvent;
import org.dselent.course_load_scheduler.client.event.OpenCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.OpenInboxEvent;
import org.dselent.course_load_scheduler.client.event.OpenScheduleEvent;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendCreateCourseEvent;
import org.dselent.course_load_scheduler.client.event.SendCreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;

/**
 * Adapter class for convenience
 * All classes that need to implement an event handler can extend from this class
 * This allows for presenters or other classes not to implement a large number of handler interfaces
 * Need to register all event handling functions with this class by implementing the handler and
 * overriding with an empty method
 * 
 * @author dselent
 * 
 */
public abstract class EventHandlerAdapter
implements InvalidLoginEventHandler, SendLoginEventHandler, OpenCreateAdminEventHandler, OpenCreateCourseEventHandler, ReceiveLoginEventHandler,
			InvalidCreateCourseEventHandler, InvalidCreateSectionEventHandler, OpenInboxEventHandler, OpenScheduleEventHandler,
			OpenSearchEventHandler, SendCreateSectionEventHandler, SendCreateCourseEventHandler
{
	//Noah - Still need to write ExecuteSearchEventHandler/Action/Event pathway
	
	@Override
	public void onInvalidLogin(InvalidLoginEvent evt) {}
	
	@Override
	public void onSendLogin(SendLoginEvent evt) {}
	
	@Override
	public void onOpenCreateAdmin(OpenCreateAdminEvent evt) {}
	
	@Override
	public void onOpenCreateCourse(OpenCreateCourseEvent evt) {}
	
	@Override
	public void onInvalidCreateCourse(InvalidCreateCourseEvent evt) {}
	
	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {}
	
	@Override
	public void onInvalidCreateSection(InvalidCreateSectionEvent evt) {}

	@Override
	public void onOpenInbox(OpenInboxEvent evt) {}
	
	@Override
	public void onOpenSchedule(OpenScheduleEvent evt) {}
	
	@Override
	public void onOpenSearch(OpenSearchEvent evt) {}
	
	@Override
	public void onSendCreateCourse(SendCreateCourseEvent evt) {}
	
	@Override
	public void onSendCreateSection(SendCreateSectionEvent evt) {}
	
}
