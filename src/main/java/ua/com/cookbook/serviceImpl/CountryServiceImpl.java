package ua.com.cookbook.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.cookbook.entity.Country;
import ua.com.cookbook.repository.CountryRepository;
import ua.com.cookbook.service.CountryService;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepository countryRepository;

    public void save(Country country) {
        countryRepository.save(country);
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country findOne(int id) {
        return countryRepository.findOne(id);
    }

    public void delete(int id) {
        countryRepository.delete(id);
    }
}
