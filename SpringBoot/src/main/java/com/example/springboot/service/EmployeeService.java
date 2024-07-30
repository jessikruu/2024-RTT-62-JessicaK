package com.example.springboot.service;

import com.example.springboot.database.DAO.EmployeeDAO;
import com.example.springboot.database.DAO.OfficesDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Offices;
import com.example.springboot.form.CreateEmployeeFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private OfficesDAO officesDAO;

    public Employee createEmployee(CreateEmployeeFormBean form) {

        log.debug(form.toString());

        Employee employee = employeeDAO.findById(form.getEmployeeId());
        if (employee == null) {
            employee = new Employee();
        }

        employee.setEmail(form.getEmail());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setExtension(form.getExtension());
        log.debug(form.getOfficeId().toString());
        employee.setJobTitle(form.getJobTitle());
        employee.setReportsTo(form.getReportsTo());
        employee.setVacationHours(form.getVacationHours());
        employee.setProfileImageURL(form.getProfileImageURL());


        Offices office = officesDAO.findById(form.getOfficeId());
        //we have to create an office object bc of the updatable = false and insertable = false
        employee.setOffice(office);

        employee = employeeDAO.save(employee);

        return employee;
    }
}
