package org.dselent.course_load_scheduler.client.network;

public final class NetworkRequestStrings
{
	public static final String SERVER_LOCATION = "http://localhost:8080/";
	public static final String BASE_REQUEST = "course_load_scheduler/";
	public static String LOGIN = "user/login";
	public static String REQUEST_SCHEDULE = "schedule/view_schedule";
	public static String OPEN_INBOX = "user/inbox";
	public static String CREATE_ADMIN = "user/create_admin";
	
	private NetworkRequestStrings() {};
}