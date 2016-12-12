package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.cookbook.entity.Ingredient;
import ua.com.cookbook.service.IngredientService;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @RequestMapping(value = "/newIngredient", method = RequestMethod.GET)
    public String ingredient(){
        return "ingredient";
    }

    @RequestMapping(value = "/newIngredient", method = RequestMethod.POST)
    public String newIngredient(@RequestParam String name, @RequestParam String amount){
        ingredientService.save(new Ingredient(name, amount));
        return "redirect:/ingredient";
    }

}
