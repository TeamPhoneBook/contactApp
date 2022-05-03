package com.example.contactApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.contactApp.model.Contact;
import com.example.contactApp.model.Organization;
import com.example.contactApp.model.Person;
import com.example.contactApp.service.PhonebookService;


@RestController
@RequestMapping(path="/contactbook")
public class PhoneBookController {
	 @Autowired
     PhonebookService phoneService;

	 //CREATE PERSON ENTRY
     @PostMapping("/add-person")
     public Contact createPerson(@RequestBody Person person) {
    	 return phoneService.createPerson(person);
     }
     
     //CREATE ORGANIZATION ENTRY
     @PostMapping("/add-organization")
     public Contact createOrganization(@RequestBody Organization organization) {
    	 return phoneService.createOrganization(organization);
     }
     
     //READ CONTACTS
     @GetMapping("/read-all")
     public List<Contact> readContacts() {
         return phoneService.getContacts();
     }
     
     //UPDATE CONTACT
     @PutMapping("/update/{id}")
     public Contact updateContact(@PathVariable(value="id") Long id, @RequestBody Contact personsInfo) {
    	 return phoneService.updateContact(id, personsInfo);
     }
     
     //DELETE CONTACT
     @DeleteMapping("/delete/{id}")
     public void deleteTrack(@PathVariable(value="id") Long id) {
     	phoneService.deleteContacts(id);
     }
     
     //PATCH CONTACT NAME
     @PatchMapping("/update-name/{id}/{name}")
     public Contact patchContactName(@PathVariable(value = "id") Long id, @PathVariable(value = "name") String name) {
     	return phoneService.updateContactName(id, name);
     }

     //PATCH CONTACT NAME
     @PatchMapping("/update-number/{id}/{number}")
     public Contact patchContactNumber(@PathVariable(value = "id") Long id, @PathVariable(value = "number") String number) {
     	return phoneService.updateContactNumber(id, number);
     }
}
