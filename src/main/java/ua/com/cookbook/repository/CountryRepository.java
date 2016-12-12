package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.cookbook.entity.Country;

/**
 * Created by koko on 14.10.16.
 */
public interface CountryRepository extends JpaRepository<Country, Integer>{
}
