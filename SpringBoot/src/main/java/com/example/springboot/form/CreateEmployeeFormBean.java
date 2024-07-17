package com.example.springboot.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {
    //this has the variables so you don't have to enter each one individually in the @getmapping to create employee

    //these annotations are called JSR-303 validations
    @Length(max=100, message = "Email must be less than 100 characters")
    @NotEmpty(message="Email is required")
    private String email;


    @Pattern(regexp = "[a-zA-Z]+", message = "Characters only")
    @Length(max=50, message = "First name must be less than 50 characters")
    @NotEmpty(message="First Name is required")
    private String firstName;

    @Length(max=50, message = "Last name must be less than 50 characters")
    @NotEmpty(message="Last Name is required")
    private String lastName;

    private String extension;
    private String jobTitle;
    private Integer vacationHours;
    private String profileImageURL;

    //we're going to make this datatype an integer bc we want to write to the db as an integer
    private Integer reportsTo;
    private Integer officeId;
}
