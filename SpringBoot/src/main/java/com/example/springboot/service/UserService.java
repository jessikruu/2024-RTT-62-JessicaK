package com.example.springboot.service;


import com.example.springboot.database.DAO.UserDAO;
import com.example.springboot.database.DAO.UserRoleDAO;
import com.example.springboot.database.entity.User;
import com.example.springboot.database.entity.UserRole;
import com.example.springboot.form.CreateAccountFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRoleDAO userRoleDAO;

    public User createUser(CreateAccountFormBean form) {

        //no errors, so we can add user to the db
        User user = new User();

        //encrypting pw before saving it to the db
        String encryptedPassword = passwordEncoder.encode(form.getPassword());

        user.setEmail(form.getEmail());
        user.setPassword(encryptedPassword);
        user.setCreateDate(new Date());



        userDAO.save(user);

//        UserRole userRole = new UserRole();
//        userRole.setRoleName("USER");
//        userRole.setUserId(user.getId());
//        userRole.setCreateDate(new Date());
//
//        userRoleDAO.save(userRole);

        createUserRole(user.getId(), "USER");

        return user;


    }


    private UserRole createUserRole(Integer userId, String roleName) {
        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleName(roleName);
        userRole.setCreateDate(new Date());

        userRoleDAO.save(userRole);

        return userRole;
    }
}
