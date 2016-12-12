package ua.com.cookbook.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.cookbook.entity.Dish;
import ua.com.cookbook.entity.Role;
import ua.com.cookbook.entity.User;
import ua.com.cookbook.repository.DishRepository;
import ua.com.cookbook.repository.UserRepository;
import ua.com.cookbook.service.DishService;
import ua.com.cookbook.service.UserService;

import java.util.List;

/**
 * Created by koko on 12.10.16.
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void save(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(int id) {
        return userRepository.findOne(id);
    }

    public void delete(int id) {
        userRepository.findOne(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }
}
