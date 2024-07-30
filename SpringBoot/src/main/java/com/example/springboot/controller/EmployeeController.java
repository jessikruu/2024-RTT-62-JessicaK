package com.example.springboot.controller;

import com.example.springboot.database.DAO.CustomerDAO;
import com.example.springboot.database.DAO.OfficesDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.DAO.EmployeeDAO;

import com.example.springboot.database.entity.Offices;
import com.example.springboot.database.entity.Product;
import com.example.springboot.form.CreateEmployeeFormBean;
import com.example.springboot.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/search")
    //the get mapping ^^^ is the url that you use in the bar
    public ModelAndView searchEmployees(@RequestParam(required = false) String search) {

        //this page is for another page of the website which is expressed by / and words after, such as http://localhost:8080/another-page

        ModelAndView response = new ModelAndView("employee/employeeSearch");
        //the view name is the jsp, and that references the page for the view

        log.debug("The user searched for the term: " + search);


        //i am going to add the user input back into the model so that we can display the search term in the input field
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

    private void loadDropdowns(ModelAndView response) {
        List<Employee> reportsToEmployees = employeeDAO.findAll();

        response.addObject("reportsToEmployees", reportsToEmployees);

        List<Offices> reportingToOffice = officesDAO.findAll();

        response.addObject("reportingToOffice", reportingToOffice);
    }


    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("employee/createEmployee");

        loadDropdowns(response);


        return response;
    }

    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam(required = false) Integer employeeId) {
        ModelAndView response = new ModelAndView("employee/createEmployee");

        loadDropdowns(response);

        if (employeeId != null) {

            Employee employee = employeeDAO.findById(employeeId);
            if (employee != null) {
                CreateEmployeeFormBean form = new CreateEmployeeFormBean();

                form.setEmployeeId(employee.getId());
                form.setEmail(employee.getEmail());
                form.setFirstName(employee.getFirstName());
                form.setLastName(employee.getLastName());
                form.setReportsTo(employee.getReportsTo());
                form.setOfficeId(employee.getOffice().getId());
                form.setExtension(employee.getExtension());
                form.setJobTitle(employee.getJobTitle());
                form.setProfileImageURL(employee.getProfileImageURL());
                form.setVacationHours(employee.getVacationHours());

                response.addObject("form", form);
            }
            else {
                response.addObject("errorMessage", "The employee wasn't found in the database");
            }
        }

        return response;
    }

//    @PostMapping("/createSubmit")
    @RequestMapping(value = "/createSubmit", method = { RequestMethod.POST, RequestMethod.GET })
//    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult) {
        //@RequestParam String **email** the email needs to match the name that was assigned in the form (if used, code above updated to shortcut)
        ModelAndView response = new ModelAndView();


        //we need to validate that the email does not exist in the database, but we only want to check if it is a create
        //if the create is using an existing email, it will skip the if statement, and drop into the .haserrors if statement below
        if (form.getEmployeeId() == null) {
            Employee e = employeeDAO.findByEmailIgnoreCase(form.getEmail());
            if (e != null) {
                bindingResult.rejectValue("email", "email", "This email is already in use, Manual Check");
            }
        }

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            //if we're in this part of the if statement, then we know an error has occurred
            //we add the binding result to the model so we can use it on the JSP page to show the user the errors
            response.addObject("bindingResult", bindingResult);

//            //the page needs the list of employees, so we need to add the list of employees to the model
//            List<Employee> reportsToEmployees = employeeDAO.findAll();
//            response.addObject("reportsToEmployees", reportsToEmployees);
//
//            //also need the list of offices
//            List<Offices> reportingToOffice = officesDAO.findAll();
//            response.addObject("reportingToOffice", reportingToOffice);

            response.setViewName("employee/createEmployee");

            //now to add the form to the model so we can display the user entered data

            response.addObject("form", form);

            return response;


        } else {

            //call the employee service to create the employee
            Employee employee = employeeService.createEmployee(form);

            //when we save to the database, it will autoincrement to give us a new id
            //the new id is available in the return from the save method
            //returns the same object after the info has been inserted into the db

            response.setViewName("redirect:/employee/info?id=" + employee.getId());
            //the redirect:/employee/info?id= is referring to the mapping of the employee info page
            //after the redirect, it will input the data and create the new page


            //below are used for post mapping
//            loadDropdowns(response);
//            response.setViewName("employee/createEmployee");

            return response;


        }
    }


}
