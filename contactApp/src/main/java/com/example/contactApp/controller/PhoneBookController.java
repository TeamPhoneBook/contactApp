package com.example.contactApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.contactApp.model.Contact;
import com.example.contactApp.model.OrganizationModel;
import com.example.contactApp.model.PersonModel;
import com.example.contactApp.service.PhonebookService;


@RestController
@RequestMapping("/contacts")
public class PhoneBookController {
	 @Autowired
     PhonebookService phoneService;

	 //CREATE PERSON ENTRY
     @PostMapping("/persons")
     public Contact createPerson(@RequestBody PersonModel person) {
    	 return phoneService.createPerson(person);
     }
     
     //CREATE ORGANIZATION ENTRY
     @PostMapping("/organization")
     public Contact createOrganization(@RequestBody OrganizationModel organization) {
    	 return phoneService.createOrganization(organization);
     }
     
     //READ CONTACTS
     @GetMapping("/all")
     public List<Contact> readContacts() {
         return phoneService.getContacts();
     }
     
     //UPDATE PERSONS
     @PutMapping("/persons")
     public PersonModel updatePersons(Long id, PersonModel personsInfo) {
    	 return phoneService.updatePersons(id, personsInfo);
     }
     
     //UPDATE ORGANIZATIONS
     @PutMapping("/organizations")
     public OrganizationModel updateContacts(Long id, OrganizationModel orgInfo) {
    	 return phoneService.updateOrganizations(id, orgInfo);
     }
     
     //DELETE
     @DeleteMapping("/all")
     public void deleteTrack(Long id) {
     	phoneService.deleteContacts(id);
     }
     
     //PATCH
     //@PatchMapping("/music/{id}/{name}")
     //public Music patchTrack(@PathVariable(value = "id") Long id, @PathVariable(value = "name") String name) {
     	//return musicService.patchTrack(id, name);
     //}

     

}
