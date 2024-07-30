package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    Customer findById(Integer id);

    @Query("select c from Customer c join Employee e on c.salesRepEmployeeID = e.id WHERE e.id = :id")
    List<Customer> findByEmployeeId(Integer id);

    List<Customer> findBySalesRepEmployeeID(Integer id);


}
