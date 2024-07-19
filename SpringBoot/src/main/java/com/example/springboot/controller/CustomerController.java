package com.example.springboot.controller;
import com.example.springboot.database.DAO.CustomerDAO;


import com.example.springboot.database.DAO.EmployeeDAO;
import com.example.springboot.database.DAO.OrdersDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Orders;
import com.example.springboot.form.CreateCustomerFormBean;
import com.example.springboot.form.CreateEmployeeFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OrdersDAO ordersDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/search")
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

    @GetMapping("/info")
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

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("customer/createCustomer");

        List<Employee> reportsToEmployees = employeeDAO.findAll();

        response.addObject("reportsToEmployees", reportsToEmployees);


        return response;
    }

    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam(required = false) Integer customerId) {
        ModelAndView response = new ModelAndView("customer/createCustomer");

        List<Employee> reportsToEmployees = employeeDAO.findAll();

        response.addObject("reportsToEmployees", reportsToEmployees);


        if (customerId != null) {

            Customer customer = customerDAO.findById(customerId);
            if (customer != null) {
                CreateCustomerFormBean form = new CreateCustomerFormBean();

                form.setCustomerName(customer.getCustomerName());
                form.setContactFirstName(customer.getContactFirstName());
                form.setContactLastName(customer.getPhone());
                form.setPhone(customer.getPhone());
                form.setAddress1(customer.getAddress1());
                form.setAddress2(customer.getAddress2());
                form.setCity(customer.getCity());
                form.setState(customer.getState());
                form.setZipCode(customer.getZipCode());
                form.setCountry(customer.getCountry());

                Employee employee = employeeDAO.findById(form.getSalesRepEmployeeID());
                //we have to create an employee object bc of the updatable = false and insertable = false
                customer.setEmployee(employee);

                response.addObject("form", form);
            }
        }

        return response;
    }

    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {
        //@RequestParam String **email** the email needs to match the name that was assigned in the form (if used, code above updated to shortcut)
        ModelAndView response = new ModelAndView();

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            //if we're in this part of the if statement, then we know an error has occurred
            //we add the binding result to the model so we can use it on the JSP page to show the user the errors
            response.addObject("bindingResult", bindingResult);

            //the page needs the list of employees, so we need to add the list of employees to the model
            List<Employee> reportsToEmployees = employeeDAO.findAll();
            response.addObject("reportsToEmployees", reportsToEmployees);


            response.setViewName("customer/createCustomer");

            //now to add the form to the model so we can display the user entered data

            response.addObject("form", form);

            return response;


        } else {


            log.debug(form.toString());

            Customer customer = new Customer();
            customer.setCustomerName(form.getCustomerName());
            customer.setContactFirstName(form.getContactFirstName());
            customer.setContactLastName(form.getContactLastName());
            customer.setPhone(form.getPhone());
            customer.setAddress1(form.getAddress1());
            customer.setAddress2(form.getAddress2());
            customer.setCity(form.getCity());
            customer.setState(form.getState());
            customer.setZipCode(form.getZipCode());
            customer.setCountry(form.getCountry());

            Employee employee = employeeDAO.findById(form.getSalesRepEmployeeID());
            //we have to create an employee object bc of the updatable = false and insertable = false
            customer.setEmployee(employee);

            customer = customerDAO.save(customer);
            //when we save to the database, it will autoincrement to give us a new id
            //the new id is available in the return from the save method
            //returns the same object after the info has been inserted into the db

            response.setViewName("redirect:/customer/info?id=" + customer.getId());
            //the redirect:/customer/info?id= is referring to the mapping of the customer info page
            //after the redirect, it will input the data and create the new page

            return response;

        }
    }
}
