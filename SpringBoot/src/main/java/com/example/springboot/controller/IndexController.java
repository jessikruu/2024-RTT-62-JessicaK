package com.example.springboot.controller;

import com.example.springboot.database.DAO.EmployeeDAO;
import com.example.springboot.database.DAO.ProductDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Slf4j
@Controller
public class IndexController {


    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) {

        //by default the @requestparam is required, meaning it has to be in the url or else you get error
        // if the id param isn't present on the url, the incoming id will be null

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("index");

        Product product = productDAO.findById(id);
        response.addObject("productKey", product);

        log.debug("Debug level");
        log.info("Info level");
        log.warn("Warn level");
        log.error("Error level");

        response.addObject("message", "Hello World!");


        return response;
    }

    @GetMapping("/index/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {

        //by default the @PathVariable is required, meaning it has to be in the url or else you get error

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


    @GetMapping("/fileUpload")
    public ModelAndView fileUpload(@RequestParam Integer employeeId) {

        ModelAndView response = new ModelAndView("fileUpload");
        response.addObject("employeeId", employeeId);

        return response;
    }

    @PostMapping("/fileUpload")
    public ModelAndView fileUploadSubmit(@RequestParam MultipartFile file, @RequestParam Integer employeeId) {

        ModelAndView modelAndView = new ModelAndView("redirect:/employee/info?id=" + employeeId);

        log.debug("The file name is: " + file.getOriginalFilename());
        log.debug("The fize size is: " + file.getSize());
        log.debug("The content type is: " + file.getContentType());


        String saveFileName = "./src/main/webapp/pub/images/" + file.getOriginalFilename();

        //Files.copy is a itility that will read the stream one chunk at a time and write it to a file
        //first argument is the input stream to read from the uploaded file
        //second is the file name where we want to write the file
        //third says to overwrite if already exists
        try {
            Files.copy(file.getInputStream(), Paths.get(saveFileName), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            log.error("Unable to finish reading file, ", e);
        }

        Employee employee = employeeDAO.findById(employeeId);

        String url = "/pub/images/" + file.getOriginalFilename();
        employee.setProfileImageURL(url);

        employeeDAO.save(employee);

        return modelAndView;
    }


}
