package org.example.database;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Employee;

import java.util.List;

public class FirstHibernateDemo {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

//        //lets create a new employee in the database
//        Employee newEmployee = new Employee();
//
//
//        newEmployee.setFirstName("First NAME!*!*");
//        newEmployee.setLastName("LAstName");
//        newEmployee.setEmail("123@gmail.com");
//        newEmployee.setOfficeId(3);
//        newEmployee.setExtension("12345");
//        newEmployee.setJobTitle("newbie");
//        newEmployee.setVacationHours(0);
//
//
//        employeeDAO.insert(newEmployee);
//
//
//
//        List<Employee> employees = employeeDAO.findByFirstName("First NAME!*!*");
//
//        for ( Employee employee : employees ) {
//            System.out.println(employee);
//            System.out.println(employee.getId() + " | " + employee.getFirstName() + " " + employee.getLastName() + " | "
//                    + employee.getEmail() + " | " + employee.getJobTitle());
//
//        }

        Employee employee = employeeDAO.findById(1056);

        System.out.println(employee);

        employee = employeeDAO.findById(1);

        System.out.println(employee);




    }
}
