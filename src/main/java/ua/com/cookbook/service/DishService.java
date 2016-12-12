package ua.com.cookbook.service;

import ua.com.cookbook.entity.Dish;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
public interface DishService {
    void save(Dish dish);
    List<Dish> findAll();
    Dish findOne(int id);
    void delete(int id);
    List<Dish> findDishByIngredients(List<Integer> ingredients);
}
