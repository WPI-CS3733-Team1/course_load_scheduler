package org.dselent.course_load_scheduler.client.model;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectionType extends Model {
	// table name
				
		// attributes
		
		private Integer id;
		private String sectionType;

		// methods
		
	
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSectionType() {
			return sectionType;
		}

		public void setSectionType(String sectionType) {
			this.sectionType = sectionType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((sectionType == null) ? 0 : sectionType.hashCode());
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
			SectionType other = (SectionType) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (sectionType == null) {
				if (other.sectionType != null)
					return false;
			} else if (!sectionType.equals(other.sectionType))
				return false;
			return true;
		}

		@Override
		public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append("Users [id=");
			builder.append(id);
			builder.append(", sectionType=");
			builder.append(sectionType);
			builder.append("]");
			return builder.toString();
		}

}
