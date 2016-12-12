package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.service.DishService;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class DishController {

    @Autowired
    private DishService dishService;

    @RequestMapping(value = "/newDish", method = RequestMethod.GET)
    public String dish(Model model){
        model.addAttribute("dish", new Dish());
        return "dish";
    }

    @RequestMapping(value = "/newDish", method = RequestMethod.POST)
    public String newDish(@RequestParam String name, @RequestParam String recipe,
                          @RequestParam String story){

        dishService.save(new Dish(name, recipe,story));
        return "redirect:/dish";
    }

}
