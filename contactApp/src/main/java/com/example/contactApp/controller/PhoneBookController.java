package com.example.contactApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Music.model.Music;
import com.example.contactApp.model.Employee;
import com.example.contactApp.model.OrganizationModel;
import com.example.contactApp.model.PersonModel;
import com.example.contactApp.service.PhonebookService;


@RestController
@RequestMapping("/api")
public class PhoneBookController {
	 @Autowired
     PhonebookService phoneService;

	//CREATE PERSON ENTRY
     @PostMapping("/contacts/persons")
     public OrganizationModel createPerson(@RequestBody PersonModel personDetails) {
         return phoneService.createOrganization(personDetails);
     }
     
	 //CREATE ORGANIZATION ENTRY
     @PostMapping("/contacts/organizations")
     public OrganizationModel createOrganization(@RequestBody OrganizationModel orgDetails) {
         return phoneService.createEmployee(emp);
     }
     
     
     @GetMapping("/contacts")
     public List<Contact> readContacts() {
         return phoneService.getEmployees();
     }
     
     //GET PERSONS
     @GetMapping("/contacts/persons")
     public List<PersonModel> readPersons() {
         return phoneService.getTracks();
     }
     
     //GET ORGANIZATIONS
     @GetMapping("/contacts/organizations")
     public List<OrganizationModel> readOrganizations() {
         return phoneService.getTracks();
     }
     
     //GET ORGANIZATIONS
     @GetMapping("/contacts/organizations")
     public Optional<Music> readTrack(@PathVariable(value="id") Long id) {
     	return phone.getTrack();
     }
     
     //PATCH
     @PatchMapping("/music/{id}/{name}")
     public Music patchTrack(@PathVariable(value = "id") Long id, @PathVariable(value = "name") String name) {
     	return musicService.patchTrack(id, name);
     }

     //PUT
     @PutMapping("/music/{id}")
     public Music updateTrack(@PathVariable(value = "id") Long id, @RequestBody Music trackDetails) {
     	return musicService.updateTrack(id, trackDetails);
     }
     
     //DELETE
     @DeleteMapping("/music/{id}")
     public void deleteTrack(@PathVariable(value = "id") Long id) {
     	musicService.deleteTrack(id);
     }

}
