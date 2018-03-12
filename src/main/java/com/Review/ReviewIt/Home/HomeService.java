package com.Review.ReviewIt.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abbott on 04-Mar-18.
 */
@Service
public class HomeService {


    //AutoWire home repository so we can operated CRUD operation in service class
    @Autowired
    HomeRepository homeRepository;


    //Getting all the items in datta base anf Displaying it
    public List<HomeItems> homeItems(){
        List<HomeItems> items=new ArrayList<>();
        homeRepository.findAll().forEach(items::add);
        return items;
    }

    // Post request method  which will help in creating new data for mongo db
    public void Add(HomeItems homeItems){
        homeRepository.save(homeItems);
    }
}
