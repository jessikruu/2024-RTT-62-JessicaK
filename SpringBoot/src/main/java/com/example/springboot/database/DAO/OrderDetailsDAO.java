package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Offices;
import com.example.springboot.database.entity.OrderDetails;
import com.example.springboot.database.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Long> {

    OrderDetails findById(Integer id);

}
