package com.swagger.swaggerpractice.repo;

import com.swagger.swaggerpractice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * from address where id=?1"
    )
    Address getById(Integer id);
}
