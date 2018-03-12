package com.Review.ReviewIt.Home;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by abbott on 04-Mar-18.
 */

//Repository Interface with mongodb Respository which will help to operate CURD operation in Data Base
public interface HomeRepository extends MongoRepository<HomeItems,String>{
}
