package com.Review.ReviewIt.Home;

import com.Review.ReviewIt.Islamabad.IslamabadItems;
import com.Review.ReviewIt.Islamabad.IslamabadService;
import com.Review.ReviewIt.Karachi.KarachiItems;
import com.Review.ReviewIt.Karachi.KarachiService;
import com.Review.ReviewIt.Lahore.LahoreItems;
import com.Review.ReviewIt.Lahore.LahoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by abbott on 04-Mar-18.
 */
@Controller
public class HomeController {

    //Getting Information From Home Service Class
    @Autowired
    HomeService homeService;

    @Autowired
    IslamabadService islamabadService;

    @Autowired
    KarachiService karachiService;

    @Autowired
    LahoreService lahoreService;

    //User Will be Directed to the root page of the web application
    @RequestMapping("/")
    public String Home(ModelMap modelMap) {
        List<HomeItems> items = new ArrayList<>();
        //Getting List of Resturant Reviews and storing it in the List
        items = homeService.homeItems();
        //Creating the model map so HTML can interact with the Reviews
        modelMap.addAttribute("Items", items);
        //Spring boot will search through the template for index.html and will display that page
        return "index";
    }


    //Post Method
    /*
        This Method is usefull of the admin wants to post new Resturant reviwes
        the the Mongo DB collection
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void add(@RequestBody HomeItems homeItems) {
        homeService.Add(homeItems);
    }

    //Will be loaded if the user Click on the Islamabad
    @RequestMapping("/Islamabad")
    public String Islamabad(ModelMap modelMap) {
        //Spring boot will search through the template for Islamabad.html and will display that page
        List<IslamabadItems> itemsList=islamabadService.items();
        modelMap.addAttribute("Islamabad",itemsList);
        return "Islamabad";
    }

    //Post Method
    /*
        This Method is usefull of the admin wants to post new Resturant reviwes
        the the Mongo DB collection
     */
    @RequestMapping(method = RequestMethod.POST, value = "/IslamabadAdd")
    public void add(@RequestBody IslamabadItems islamabadItems) {
        islamabadService.Islamabad_add(islamabadItems);
    }

    @RequestMapping("/Karachi")
    public String Karachi(ModelMap modelMap){
        List<KarachiItems> items=karachiService.karachiItems();
        modelMap.addAttribute("Karachi",items);
        return "Karachi";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/KarachiAdd")
    public void AddKarachi(@RequestBody KarachiItems karachiItems){
        karachiService.AddItems(karachiItems);

    }

    @RequestMapping("/Lahore")
    public String Lahore(ModelMap modelMap){
        List<LahoreItems> items=lahoreService.lahoreItems();
        modelMap.addAttribute("Lahore",items);
        return "Lahore";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/LahoreAdd")
    public void AddLahore(@RequestBody LahoreItems lahoreItems){
        lahoreService.AddLahore(lahoreItems);
    }

}
