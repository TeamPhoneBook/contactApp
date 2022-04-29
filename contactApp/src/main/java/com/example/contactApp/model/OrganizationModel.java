package com.example.contactApp.model;

import javax.persistence.Entity;

@Entity
public class OrganizationModel extends Contact {
        
        private String website;
        
        public OrganizationModel(String name, String phoneNumber, String createdAt, String website) {
        	super(name, phoneNumber, createdAt);
        	this.website = website;
        }

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		@Override
		public String toString() {
			return "OrganizationModel [website=" + website + ", getWebsite()=" + getWebsite() + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getCreatedAt()="
					+ getCreatedAt() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
		
}
