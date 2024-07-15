package com.example.springboot.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {
    //this has the variables so you don't have to enter each one individually in the @getmapping to create employee

    private String email;
    private String firstName;
    private String lastName;

    //we're going to make this datatype an integer bc we want to write to the db as an integer
    private Integer reportsTo;
}
