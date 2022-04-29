package com.example.contactApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contactApp.model.PersonModel;
import com.example.contactApp.model.Contact;
import com.example.contactApp.model.OrganizationModel;
import com.example.contactApp.repository.ContactRepository;


import java.util.List;


@Service
public class PhonebookService extends Contact {

        @Autowired
        	ContactRepository contactsRepository;

//CREATE PERSON
public Contact createPerson(PersonModel person) {
 return contactsRepository.save(person);
}

//CREATE ORGANIZATION
public Contact createOrganization(OrganizationModel organization) {
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

//UPDATE CONTACTS
public Contact updateContacts(Long Id, Contact contactsDetails) {
     Contact contacts = contactsRepository.findById(Id).get();
     contacts.setName(contactsDetails.getName());
     contacts.setPhoneNumber(contactsDetails.getPhoneNumber());
     contacts.setCreatedAt(contactsDetails.getCreatedAt());
     
     return contactsRepository.save(contacts);                                
}

//UPDATE PERSON
public Contact updatePerson(Long Id, PersonModel contactsDetails) {
    PersonModel person = (PersonModel) contactsRepository.findById(Id).get();
    person.setName(contactsDetails.getName());
    person.setPhoneNumber(contactsDetails.getPhoneNumber());
    person.setCreatedAt(contactsDetails.getCreatedAt());
    person.setEmail(contactsDetails.getEmail());
    person.setDob(contactsDetails.getDob());
    
    return contactsRepository.save(person);             


}

//UPDATE ORGANIZATION
public Contact updateOrganization(Long Id, OrganizationModel contactsDetails) {
	OrganizationModel organization = (OrganizationModel) contactsRepository.findById(Id).get();
	organization.setName(contactsDetails.getName());
	organization.setPhoneNumber(contactsDetails.getPhoneNumber());
	organization.setCreatedAt(contactsDetails.getCreatedAt());
	organization.setWebsite(contactsDetails.getWebsite());
    
    return contactsRepository.save(organization); 
    
}
}