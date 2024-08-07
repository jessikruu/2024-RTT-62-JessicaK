package com.example.springboot.database.DAO;

import com.example.springboot.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {


    User findByEmailIgnoreCase(String email);

}
