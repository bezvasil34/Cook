package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.cookbook.entity.Ingredient;

import java.util.List;

/**
 * Created by koko on 14.10.16.
 */
public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {


}
