package org.dselent.course_load_scheduler.client.action;

public class OpenScheduleAction extends Action
{
	private String term;
	private String userName;
	
	public OpenScheduleAction(String userName, String term)
	{
		this.userName = userName;
		this.term = term;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getTerm()
	{
		return term;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("OpenScheduleAction [userName=");
		builder.append(userName);
		builder.append(", term=");
		builder.append(term);
		builder.append("]");
		return builder.toString();
	}
}
