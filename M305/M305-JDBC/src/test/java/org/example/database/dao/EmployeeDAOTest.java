package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeDAOTest {

    private static EmployeeDAO employeeDAO = new EmployeeDAO();


    @BeforeAll
    @AfterAll
    public static void beforeAll() {
        List<Employee> employees = employeeDAO.findByFirstName("firstName");

        for (Employee employee : employees) {
            employeeDAO.delete(employee);
        }

    }


    @Test
    public void findByIdTest() {
        //given

        Integer userId = 1002;


        //when

        Employee employee = employeeDAO.findById(userId);

        //then

        Assertions.assertNotNull(employee);
        Assertions.assertEquals(userId, employee.getId());

    }

    @Test
    public void findByFirstNameTest() {
        //given

        //when
        List<Employee> employee = employeeDAO.findByFirstName("firstName");

        //then
        Assertions.assertNotNull(employee);
        Assertions.assertTrue(employee.size() > 0);
        Assertions.assertTrue(employee.stream().anyMatch(employees -> employees.getFirstName().equals("firstName")));

    }

    @Test
    public void createNewEmployee() {

        //given

        Employee given = new Employee();

        given.setOfficeId(2);
        given.setLastName("lastName");
        given.setFirstName("firstName");
        given.setExtension("1234");
        given.setEmail("f.nnn@yourwebsite.com");
        given.setJobTitle("Sales");

        //when
        employeeDAO.insert(given);

        //then

        Employee actual = employeeDAO.findById(given.getId());

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());


    }


}
