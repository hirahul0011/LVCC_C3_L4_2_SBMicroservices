package com.ecommerce.LVCC_C3_L4_22_SBMicroservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.LVCC_C3_L4_22_SBMicroservices.entity.HobbyEntity;
import com.ecommerce.LVCC_C3_L4_22_SBMicroservices.repository.HobbyRepository;

@Service
public class HobbyService {
	
	@Autowired
    HobbyRepository hobbyRepository;
    
    public String findByPersonId(int personid){
        return hobbyRepository.findByPersonId(personid);
    }   
    public void addHobby(HobbyEntity he){
        hobbyRepository.save(he);
    }

}
