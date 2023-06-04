package com.relationship.OneToMany.repo;

import com.relationship.OneToMany.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
