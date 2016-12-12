package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.cookbook.entity.User;

/**
 * Created by koko on 14.10.16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
