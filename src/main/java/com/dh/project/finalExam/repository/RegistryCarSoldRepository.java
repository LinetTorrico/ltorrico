package com.dh.project.finalExam.repository;

import com.dh.project.finalExam.domain.RegistryCarSold;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by Linet on 22/6/2017.
 */
public interface RegistryCarSoldRepository extends MongoRepository<RegistryCarSold, String> {

    @Query("{ 'seller.id' : ?0 }")
    RegistryCarSold findRegistriesBySeller(String id);

}
