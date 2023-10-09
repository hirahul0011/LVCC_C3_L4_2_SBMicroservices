package com.ecommerce.LVCC_C3_L4_21_SBMicroservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.entity.PersonEntity;
import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.response.PersonResonse;
import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.service.PersonService;

@RestController
@RequestMapping(path = "/webapione")
public class PersonControlller {
	
    @Autowired
    PersonService personService;
    
    @RequestMapping("/person/{personId}")
    public PersonResonse getPerson(@PathVariable int personId){
        return personService.getPerson(personId);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/person")   
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }


}
