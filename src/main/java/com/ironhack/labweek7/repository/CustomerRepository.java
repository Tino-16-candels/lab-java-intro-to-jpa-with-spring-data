package com.ironhack.labweek7.repository;

import com.ironhack.labweek7.model.Customer;
import com.ironhack.labweek7.model.enums.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    List<Customer> findAllByUsingSQL();

    @Query(value = "SELECT * FROM customer WHERE status_type = ?1", nativeQuery = true)
    List<Customer> findByUsingSQL(StatusType statusType);
}
