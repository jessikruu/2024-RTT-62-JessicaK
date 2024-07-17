package com.example.springboot.controller;
import com.example.springboot.database.DAO.CustomerDAO;


import com.example.springboot.database.DAO.OrdersDAO;
import com.example.springboot.database.entity.Customer;
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
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OrdersDAO ordersDAO;

    @GetMapping("/customer/search")
    //the get mapping ^^^ is the url that you use in the bar
    public ModelAndView searchCustomers(@RequestParam(required = false) Integer search) {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("customer/customerSearch");
        //the view name is the jsp, and that references the page for the view

        log.debug("The user searched for the term: " + search);


        //i am going to add the user input back into the model so that we can display the search term in the input field
        response.addObject("search", search);

        List<Customer> customers = customerDAO.findByEmployeeId(search);
        response.addObject("customers", customers);
        //the attribute name assigns a name for the jsp to use, the second term needs to match the list name, bc that is what references it
        log.debug(customers.toString());

        return response;
    }

    @GetMapping("/customer/info")
    public ModelAndView productInfo(@RequestParam(required = false) Integer id) {

        //by default the @requestparam is required, meaning it has to be in the url or else you get error
        // if the id param isn't present on the url, the incoming id will be null

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("customer/customerInfo");

        Customer customer = customerDAO.findById(id);
        response.addObject("customerKey", customer);

        List<Orders> orders = ordersDAO.findByCustomerID(id);
        response.addObject("orders", orders);



        return response;
    }
}
