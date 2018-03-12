package com.Review.ReviewIt.Lahore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abbott on 06-Mar-18.
 */
@Service
public class LahoreService {

    @Autowired
    LahoreRepository lahoreRepository;

    public List<LahoreItems> lahoreItems(){
        List<LahoreItems> items=new ArrayList<>();
        lahoreRepository.findAll().forEach(items::add);
        return items;
    }

    public void AddLahore(LahoreItems lahoreItems){
        lahoreRepository.save(lahoreItems);
    }
}
