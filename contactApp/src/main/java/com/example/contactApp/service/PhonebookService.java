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

			//UPDATE PERSON CONTACTS
			public Person updatePersons(Long Id, Person personDetails) {
				Person persons = (Person) contactsRepository.findById(Id).get();

				persons.setEmail(personDetails.getEmail());
				persons.setDob(personDetails.getDob());

				return contactsRepository.save(persons);
			}

			//UPDATE ORGANIZATION CONTACTS
			public Organization updateOrganizations(Long Id, Organization orgDetails) {
				Organization organization = (Organization) contactsRepository.findById(Id).get();

				organization.getClass().toString();
				organization.setWebsite(orgDetails.getWebsite());

				return contactsRepository.save(organization);
			}

}