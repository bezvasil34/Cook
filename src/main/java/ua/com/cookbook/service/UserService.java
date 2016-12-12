package ua.com.cookbook.service;

import ua.com.cookbook.entity.User;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
public interface UserService {
    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete(int id);
}
