package com.ecommerce.LVCC_C3_L4_21_SBMicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.LVCC_C3_L4_21_SBMicroservices.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
