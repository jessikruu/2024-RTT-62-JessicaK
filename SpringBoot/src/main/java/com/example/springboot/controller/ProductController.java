package com.example.springboot.controller;


import com.example.springboot.database.DAO.ProductDAO;
import com.example.springboot.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductDAO productDAO;

    @GetMapping("/info")
    public ModelAndView productInfo(@RequestParam(required = false) Integer id) {

        //by default the @requestparam is required, meaning it has to be in the url or else you get error
        // if the id param isn't present on the url, the incoming id will be null

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("product/productInfo");

        Product product = productDAO.findById(id);
        response.addObject("productKey", product);



        return response;
    }

    @GetMapping("search")
    public ModelAndView search(@RequestParam(required = false) String search) {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("product/productSearch");

        log.debug("The user searched for the term: " + search);

        //i am going to add the user unput back into the model so that we can display the search term in the input field
        response.addObject("search", search);

        List<Product> products = productDAO.findByNameOrCode(search);
        response.addObject("products", products);

        return response;
    }


}
