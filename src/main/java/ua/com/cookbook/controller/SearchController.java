package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.service.DishService;
import ua.com.cookbook.service.IngredientService;

import java.util.List;

/**
 * Created by koko on 29.10.16.
 */
@Controller
public class SearchController {

    @Autowired
    private DishService dishService;

    @RequestMapping(value = "/searchRecipe", method = RequestMethod.POST)
    public String searchRecipe(@RequestParam List<Integer> search, Model model){
        model.addAttribute("dishes", dishService.findDishByIngredients(search));
        System.out.println(dishService.findDishByIngredients(search));
        return "home";
    }




}
