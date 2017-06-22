package com.dh.project.finalExam.repository;

import com.dh.project.finalExam.domain.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Linet on 22/6/2017.
 */
public interface BuyerRepository extends MongoRepository<Buyer, String> {
}
