package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Offices;
import com.example.springboot.database.entity.OrderDetails;
import com.example.springboot.database.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Long> {

    OrderDetails findById(Integer id);

//    @Query("select od from OrderDetails od join Orders o on o.id = od.orderId WHERE o.id = :id")
    List<OrderDetails> findByOrderId(Integer id);

//    @Query(value = "select o.id as order_id, sum(od.price_each * od.quantity_ordered) as total " +
//            "from orderdetails od, products p, orders o " +
//            "where od.product_id = p.id and o.id = od.order_id " +
//            "group by od.order_id " +
//            "order by order_id;", nativeQuery = true )
//    List<OrderDetails> findTotal(Integer id);

}
