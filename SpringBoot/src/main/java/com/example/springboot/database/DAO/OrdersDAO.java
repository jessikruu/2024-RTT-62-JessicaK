package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface OrdersDAO extends JpaRepository<Orders, Long> {

    Orders findById(Integer id);

//    @Query("SELECT o from Orders o join Customer c on o.customerID = c.id WHERE c.id = :id")
    List<Orders> findByCustomerID(Integer id);


    //in the result, the string is the column name, and the object is the value in the column
    //each item in the list represents a row in the result set from the db
    //<Map<String,Object>> = 1 singular row
    //this is an ad hoc query, meaning needed in the moment
    //we are using Native SQL, so we have to give the flag in the query annotation to be nativeQuery=true
    @Query(value ="select o.id as order_id, o.order_date, od.quantity_ordered, p.product_name, od.price_each, (od.price_each * od.quantity_ordered) as line_item_total, p.id as product_id, (od.quantity_ordered * od.price_each) as line_item_total from orderdetails od, products p, orders o where od.order_id = :orderId and o.id = :orderId and od.product_id = p.id;", nativeQuery = true )
    public List<Map<String,Object>> getOrderDetails(Integer orderId);



}
