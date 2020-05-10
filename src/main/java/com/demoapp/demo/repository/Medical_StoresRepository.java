package com.demoapp.demo.repository;

import com.demoapp.demo.model.Medical_Stores;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medical_StoresRepository extends MongoRepository<Medical_Stores, String> {
}
