package com.example.springboot.controller;

import com.example.springboot.database.DAO.OrderDetailsDAO;
import com.example.springboot.database.DAO.OrdersDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.OrderDetails;
import com.example.springboot.database.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class OrdersController {

    @Autowired
    private OrdersDAO ordersDAO;

    @Autowired
    private OrderDetailsDAO orderDetailsDAO;

    @GetMapping("/orders/search")
    //the get mapping ^^^ is the url that you use in the bar
    public ModelAndView searchOrders(@RequestParam(required = false) Integer search) {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("orders/orderSearch");
        //the view name is the jsp, and that references the page for the view

        log.debug("The user searched for the term: " + search);


        //i am going to add the user unput back into the model so that we can display the search term in the input field
        response.addObject("search", search);

        List<Orders> orders = ordersDAO.findByCustomerID(search);
        response.addObject("orders", orders);
        //the attribute name assigns a name for the jsp to use, the second term needs to match the list name, bc that is what references it
        log.debug(orders.toString());

        return response;
    }

    @GetMapping("/orders/info")
    public ModelAndView orderInfo(@RequestParam(required = false) Integer id) {

        //by default the @requestparam is required, meaning it has to be in the url or else you get error
        // if the id param isn't present on the url, the incoming id will be null

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("orders/orderInfo");

        Orders order  = ordersDAO.findById(id);
        response.addObject("orderKey", order);

        List<OrderDetails> orderDetails = orderDetailsDAO.findByOrderId(id);
        response.addObject("orderDetails", orderDetails);



        return response;
    }
}
