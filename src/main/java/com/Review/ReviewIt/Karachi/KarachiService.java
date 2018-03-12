package com.Review.ReviewIt.Karachi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abbott on 06-Mar-18.
 */
@Service
public class KarachiService {

    @Autowired
    KarachiRepository karachiRepository;

    public List<KarachiItems> karachiItems(){
        List<KarachiItems> items=new ArrayList<>();
        karachiRepository.findAll().forEach(items::add);
        return items;
    }

    public void AddItems(KarachiItems karachiItems){
        karachiRepository.save(karachiItems);
    }
}
