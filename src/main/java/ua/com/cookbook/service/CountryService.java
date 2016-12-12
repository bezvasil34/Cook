package ua.com.cookbook.service;

import ua.com.cookbook.entity.Country;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
public interface CountryService {

    void save(Country country);
    List<Country> findAll();
    Country findOne(int id);
    void delete(int id);

}
