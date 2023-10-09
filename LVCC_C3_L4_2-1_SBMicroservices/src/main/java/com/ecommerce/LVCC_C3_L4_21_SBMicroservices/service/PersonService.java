package com.ecommerce.LVCC_C3_L4_21_SBMicroservices.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.entity.PersonEntity;
import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.repository.PersonRepository;
import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.response.PersonResonse;

@Service
public class PersonService {
	
    @Autowired
    PersonRepository personRepository;
    
    RestTemplate restTemplate = new RestTemplate();
        
    public PersonResonse getPerson(int personId){
        final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";
        
         Map<String, Integer> params = new HashMap<String, Integer>();
         params.put("personId", personId);
         
         String result = restTemplate.getForObject(uri, String.class, params);
         PersonEntity pe=personRepository.findById(personId).get();
         PersonResonse pr=new PersonResonse();
         pr.setPersonId(pe.getPersonId());
         pr.setName(pe.getName());
         pr.setAge(pe.getAge());
         pr.setHobby(result);
        
        return pr;
    }   
    public void addPerson(PersonEntity pe){
        personRepository.save(pe);
    }


}
