package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.cookbook.entity.Dish;

import java.util.List;

/**
 * Created by koko on 14.10.16.
 */
public interface DishRepository extends JpaRepository<Dish, Integer>{

    @Query(value = "select d from Dish d left join fetch d.ingredients i where i.id in :ingredients")
    List<Dish> findDishByIngredients(@Param("ingredients") List<Integer> ingredients);

}
