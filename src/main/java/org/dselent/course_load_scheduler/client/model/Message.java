package org.dselent.course_load_scheduler.client.model;

import java.sql.JDBCType;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Message extends Model {
	// table name
		
		// attributes
		
		private Integer id;
		private Integer userId;
		private String authorUserName;
		private String message;
		private boolean resolved;
		private Instant receivedAt;
		private Integer deptId;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getAuthorUserName() {
			return authorUserName;
		}

		public void setAuthorUserName(String authorUserName) {
			this.authorUserName = authorUserName;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public boolean isResolved() {
			return resolved;
		}

		public void setResolved(boolean resolved) {
			this.resolved = resolved;
		}

		public Instant getReceivedAt() {
			return receivedAt;
		}

		public void setReceivedAt(Instant receivedAt) {
			this.receivedAt = receivedAt;
		}

		public Integer getDeptId() {
			return deptId;
		}

		public void setDeptId(Integer deptId) {
			this.deptId = deptId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((authorUserName == null) ? 0 : authorUserName.hashCode());
			result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((message == null) ? 0 : message.hashCode());
			result = prime * result + ((receivedAt == null) ? 0 : receivedAt.hashCode());
			result = prime * result + (resolved ? 1231 : 1237);
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Message other = (Message) obj;
			if (authorUserName == null) {
				if (other.authorUserName != null)
					return false;
			} else if (!authorUserName.equals(other.authorUserName))
				return false;
			if (deptId == null) {
				if (other.deptId != null)
					return false;
			} else if (!deptId.equals(other.deptId))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (message == null) {
				if (other.message != null)
					return false;
			} else if (!message.equals(other.message))
				return false;
			if (receivedAt == null) {
				if (other.receivedAt != null)
					return false;
			} else if (!receivedAt.equals(other.receivedAt))
				return false;
			if (resolved != other.resolved)
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			return true;
		}

		// methods
		@Override
		public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("Users [id=");
			builder.append(id);
			builder.append(", userId=");
			builder.append(userId);
			builder.append(", authorUserName=");
			builder.append(authorUserName);
			builder.append(", message=");
			builder.append(message);
			builder.append(", resolved=");
			builder.append(resolved);
			builder.append(", receivedAt=");
			builder.append(receivedAt);
			builder.append(", deptId=");
			builder.append(deptId);
			builder.append("]");
			return builder.toString();
		}

}
