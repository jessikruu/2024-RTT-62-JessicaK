package com.example.springboot.controller;

import com.example.springboot.database.DAO.CustomerDAO;
import com.example.springboot.database.DAO.OfficesDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.DAO.EmployeeDAO;

import com.example.springboot.database.entity.Offices;
import com.example.springboot.database.entity.Product;
import com.example.springboot.form.CreateEmployeeFormBean;
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
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OfficesDAO officesDAO;

    @GetMapping("/search")
    //the get mapping ^^^ is the url that you use in the bar
    public ModelAndView searchEmployees(@RequestParam(required = false) String search) {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("employee/employeeSearch");
        //the view name is the jsp, and that references the page for the view

        log.debug("The user searched for the term: " + search);


        //i am going to add the user unput back into the model so that we can display the search term in the input field
        response.addObject("search", search);

        List<Employee> employees = employeeDAO.findByFirstOrLastName(search);
        response.addObject("employees", employees);
        //the attribute name assigns a name for the jsp to use, the second term needs to match the list name, bc that is what references it
        log.debug(employees.toString());



        return response;
    }

    @GetMapping("/info")
    public ModelAndView productInfo(@RequestParam(required = false) Integer id) {

        //by default the @requestparam is required, meaning it has to be in the url or else you get error
        // if the id param isn't present on the url, the incoming id will be null

        //this function is for the home page of the website which is expressed as just the plain /

        ModelAndView response = new ModelAndView("employee/employeeInfo");

        Employee employee = employeeDAO.findById(id);
        response.addObject("employeeKey", employee);

        List<Customer> customers = customerDAO.findBySalesRepEmployeeID(id);
        response.addObject("customers", customers);



        return response;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("employee/createEmployee");

        List<Employee> reportsToEmployees = employeeDAO.findAll();

        response.addObject("reportsToEmployees", reportsToEmployees);

        List<Offices> reportingToOffice = officesDAO.findAll();

        response.addObject("reportingToOffice", reportingToOffice);

        return response;
    }

    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(CreateEmployeeFormBean form) {
        //@RequestParam String **email** the email needs to match the name that was assigned in the form (if used, code above updated to shortcut)
        ModelAndView response = new ModelAndView();

        log.debug(form.toString());

        Employee employee = new Employee();
        employee.setEmail(form.getEmail());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setExtension("x123");
        employee.setOfficeId(form.getOfficeId());
        log.debug(form.getOfficeId().toString());
        employee.setJobTitle("CEO");
        employee.setReportsTo(form.getReportsTo());

        employee = employeeDAO.save(employee);
        //when we save to the database, it will autoincrement to give us a new id
        //the new id is available in the return from the save method
        //returns the same object after the info has been inserted into the db

        response.setViewName("redirect:/employee/info?id=" + employee.getId());
        //the redirect:/employee/info?id= is referring to the mapping of the employee info page
        //after the redirect, it will input the data and create the new page

        return response;
    }
}
