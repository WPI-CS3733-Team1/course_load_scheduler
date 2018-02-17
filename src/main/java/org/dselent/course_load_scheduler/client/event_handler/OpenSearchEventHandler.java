package org.dselent.course_load_scheduler.client.event_handler;
import org.dselent.course_load_scheduler.client.event.OpenSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface OpenSearchEventHandler extends EventHandler
{
	  public void onOpenSearch(OpenSearchEvent evt);
}
