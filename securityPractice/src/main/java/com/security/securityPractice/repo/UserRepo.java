package com.security.securityPractice.repo;

import com.security.securityPractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(
            nativeQuery = true,
            value = "SELECT * from users where user_name=?1"
    )
    User getUserByUsername(String user_name);
}
