package com.example.contactApp.model;

import javax.persistence.Entity;

@Entity
public class PersonModel extends Contact {
        
        private String email;
        
        private String dob;
        
        public PersonModel(String name, String phoneNumber, String createdAt, String email, String dob) {
        	super(name, phoneNumber, createdAt);
        	this.email= email;
        	this.dob = dob;
        }

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		@Override
		public String toString() {
			return "PersonModel [email=" + email + ", dob=" + dob + ", getEmail()=" + getEmail() + ", getDob()="
					+ getDob() + ", getId()=" + getId() + ", getName()=" + getName() + ", getPhoneNumber()="
					+ getPhoneNumber() + ", getCreatedAt()=" + getCreatedAt() + ", toString()=" + super.toString()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
        
}
