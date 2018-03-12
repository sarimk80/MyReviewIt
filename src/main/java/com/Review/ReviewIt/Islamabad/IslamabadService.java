package com.Review.ReviewIt.Islamabad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abbott on 05-Mar-18.
 */
@Service
public class IslamabadService {

    @Autowired
    IslamabadRepository islamabadRepository;


    public List<IslamabadItems> items(){
        List<IslamabadItems> islamabadItems=new ArrayList<>();
        islamabadRepository.findAll().forEach(islamabadItems::add);
        return islamabadItems;
    }


    public void Islamabad_add(IslamabadItems islamabadItems){
        islamabadRepository.save(islamabadItems);
    }
}
