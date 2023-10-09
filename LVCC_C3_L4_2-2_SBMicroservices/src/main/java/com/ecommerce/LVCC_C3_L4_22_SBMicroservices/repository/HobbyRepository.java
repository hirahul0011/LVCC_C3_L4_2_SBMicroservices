package com.ecommerce.LVCC_C3_L4_22_SBMicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.LVCC_C3_L4_22_SBMicroservices.entity.HobbyEntity;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{
	
    @Query("SELECT h.name FROM HobbyEntity h WHERE h.personId=:personId")
    public String findByPersonId(Integer personId);


}
