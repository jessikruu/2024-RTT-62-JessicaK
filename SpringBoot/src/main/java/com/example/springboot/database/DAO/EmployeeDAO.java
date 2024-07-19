package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    Employee findById(Integer id);

    @Query("select e from Employee e where e.lastName like concat('%', :name, '%') or e.firstName like concat('%', :name, '%') ")
    List<Employee> findByFirstOrLastName(String name);

    Employee findByEmailIgnoreCase(String email);

}
