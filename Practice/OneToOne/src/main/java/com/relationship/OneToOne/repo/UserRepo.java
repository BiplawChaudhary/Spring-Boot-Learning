package com.relationship.OneToOne.repo;

import com.relationship.OneToOne.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
