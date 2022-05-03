package com.example.contactApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contactApp.model.Person;
import com.example.contactApp.model.Contact;
import com.example.contactApp.model.Organization;
import com.example.contactApp.repository.ContactRepository;


import java.util.List;


@Service
public class PhonebookService extends Contact {

        @Autowired
        ContactRepository contactsRepository;

        	//CREATE PERSON
			public Contact createPerson(Person person) {
				return contactsRepository.save(person);
			}

			//CREATE ORGANIZATION
			public Contact createOrganization(Organization organization) {
				return contactsRepository.save(organization);
			}

			//READ
			public List<Contact> getContacts() {
				return contactsRepository.findAll();

			}

			//DELETE
			public void deleteContacts(Long Id) {
				contactsRepository.deleteById(Id);
			}

			//UPDATE CONTACT
			public Contact updateContact(Long Id, Contact newInfo) {
				Contact contact = contactsRepository.getById(Id);
				
				contact.setName(newInfo.getName());
				contact.setCreatedAt(newInfo.getCreatedAt());
				contact.setPhoneNumber(newInfo.getPhoneNumber());
				
				return contactsRepository.save(contact);
			}
			
			//PATCH CONTACT NAME
			public Contact updateContactName(Long Id, String newName) {
				Contact contact = contactsRepository.getById(Id);
				
				contact.setName(newName);
				
				return contactsRepository.save(contact);
			}
			
			//PATCH CONTACT NUMBER
			public Contact updateContactNumber(Long Id, String newNumber) {
				Contact contact = contactsRepository.getById(Id);
				
				contact.setPhoneNumber(newNumber);
				
				return contactsRepository.save(contact);
			}
}