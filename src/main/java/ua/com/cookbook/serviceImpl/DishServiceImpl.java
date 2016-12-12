package ua.com.cookbook.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.repository.DishRepository;
import ua.com.cookbook.service.DishService;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishRepository dishRepository;

    public void save(Dish dish) {
        dishRepository.save(dish);
    }

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public Dish findOne(int id) {
        return dishRepository.findOne(id);
    }

    public void delete(int id) {
        dishRepository.delete(id);
    }

    @Override
    public List<Dish> findDishByIngredients(List<Integer> ingredients) {
        if(ingredients==null) return Collections.emptyList();
        if (ingredients.isEmpty()) return Collections.emptyList();
        return dishRepository.findDishByIngredients(ingredients);
    }
}
