package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.entity.User;
import ua.com.cookbook.service.DishService;
import ua.com.cookbook.service.IngredientService;

import java.util.Collections;
import java.util.List;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class HomeController {

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private DishService dishService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model, @RequestParam(required = false) List<Integer> search){
        model.addAttribute("ingredients", ingredientService.findAll());
        model.addAttribute("user", new User());
        model.addAttribute("dishes", dishService.findDishByIngredients(search));
        return "home";
    }

    @RequestMapping(value = {"/home"}, method = RequestMethod.POST)
    public String home(){
        return "redirect:/";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(){
        return "admin";
    }

}
