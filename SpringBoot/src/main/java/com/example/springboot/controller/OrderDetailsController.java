package com.example.springboot.controller;

import com.example.springboot.database.DAO.OrderDetailsDAO;
import com.example.springboot.database.entity.OrderDetails;
import com.example.springboot.form.OrderDetailsBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/orderDetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsDAO orderDetailsDAO;

    @GetMapping("/info")
    public ModelAndView orderDetailsInfo(@RequestParam(required = false) Integer id) {


        ModelAndView response = new ModelAndView("orderDetails/info");

        OrderDetails orderDetails = orderDetailsDAO.findById(id);
        response.addObject("orderDetails", orderDetails);

        return response;
    }

    @GetMapping("/create")
    public ModelAndView createDetails(OrderDetailsBean form) {

        ModelAndView response = new ModelAndView();

        OrderDetails orderDetails = new OrderDetails();

        orderDetails.setProductId(form.getProductId());


        return response;
    }
}
