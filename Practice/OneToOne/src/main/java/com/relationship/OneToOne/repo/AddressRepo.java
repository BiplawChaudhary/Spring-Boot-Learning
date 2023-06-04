package com.relationship.OneToOne.repo;

import com.relationship.OneToOne.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
