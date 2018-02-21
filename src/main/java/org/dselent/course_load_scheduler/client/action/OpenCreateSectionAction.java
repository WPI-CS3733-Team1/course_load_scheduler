package org.dselent.course_load_scheduler.client.action;

public class OpenCreateSectionAction {
	
		private String userName;
		
		public OpenCreateSectionAction(String userName)
		{
			this.userName = userName;
		}

		public String getUserName()
		{
			return userName;
		}

		@Override
		public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("OpenCreateSectionAction [userName=");
			builder.append(userName);
			builder.append("]");
			return builder.toString();
		}
	}



