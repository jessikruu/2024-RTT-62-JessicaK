package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Offices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfficesDAO extends JpaRepository<Offices, Long> {

    Offices findById(Integer id);

//    @Query("select o.city from Offices o order by o.city asc")
//    List<Offices> findAllOffices();

}
