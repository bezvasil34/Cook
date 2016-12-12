package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.com.cookbook.entity.Country;
import ua.com.cookbook.service.CountryService;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;


    @RequestMapping(value = "/newCountry", method = RequestMethod.GET)
    public String country(){
        return "country";
    }

//    @RequestMapping(value = "/newCountry",method = RequestMethod.POST)
//    public String newCountry(@RequestParam String name){
//        countryService.save(new Country(name));
//        return "redirect:/country";
//    }

    @RequestMapping(value = "/newCountry",method = RequestMethod.POST)
    public @ResponseBody Country newCountry(@RequestBody Country country){
        countryService.save(country);

        return country;
    }

}
