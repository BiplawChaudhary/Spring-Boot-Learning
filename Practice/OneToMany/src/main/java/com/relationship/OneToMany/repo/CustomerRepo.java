package com.relationship.OneToMany.repo;

import com.relationship.OneToMany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
