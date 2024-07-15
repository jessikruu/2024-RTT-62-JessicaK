package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersDAO extends JpaRepository<Orders, Long> {

    Orders findById(Integer id);

    @Query("SELECT o from Orders o join Customer c on o.customerID = c.id WHERE c.id = :id")
    List<Orders> findByCustomerId(Integer id);

}
