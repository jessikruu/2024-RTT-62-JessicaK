package com.example.springboot.controller;

import com.example.springboot.database.DAO.ProductDAO;
import com.example.springboot.database.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {


    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public ModelAndView index(@RequestParam Integer id) {

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("index");

        Product product = productDAO.findById(id);
        response.addObject("productKey", product);

        response.addObject("message", "Hello World!");


        return response;
    }

    @GetMapping("/another-page")
    public ModelAndView anotherpage() {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("another-page");

        return response;
    }


}
