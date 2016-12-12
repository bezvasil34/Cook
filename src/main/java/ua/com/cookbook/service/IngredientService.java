package ua.com.cookbook.service;

import ua.com.cookbook.entity.Ingredient;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
public interface IngredientService {
    void save(Ingredient ingredient);
    List<Ingredient> findAll();
    Ingredient findOne(int id);
    void delete(int id);
}
