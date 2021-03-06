package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.InvalidResolveMessageEvent;

import com.google.gwt.event.shared.EventHandler;

/**
 * Interface to specify an event handler
 * All classes that listen for this event should implement this interface
 * Alternatively classes can extend the EventHandlerAdapter class and override the functions
 * 
 * @author bwagner
 *
 */
public interface InvalidResolveMessageEventHandler extends EventHandler
{
	  public void onInvalidResolveMessage(InvalidResolveMessageEvent evt);
}
