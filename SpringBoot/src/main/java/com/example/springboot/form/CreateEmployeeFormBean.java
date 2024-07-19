package com.example.springboot.form;

import com.example.springboot.validation.EmployeeEmailUnique;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private Integer employeeId;
    //this has the variables so you don't have to enter each one individually in the @getmapping to create employee

    //these annotations are called JSR-303 validations
    @Length(max=100, message = "Email must be less than 100 characters")
    @NotEmpty(message="Email is required")
    @Email(message = "Must be a valid email")
//    @EmployeeEmailUnique(message = "This email is already in use.")
    private String email;


    @Pattern(regexp = "[a-zA-Z]+", message = "Characters only")
    @Length(max=50, message = "First name must be less than 50 characters")
    @NotEmpty(message="First Name is required")
    private String firstName;

    @Length(max=50, message = "Last name must be less than 50 characters")
    @NotEmpty(message="Last Name is required")
    private String lastName;

    @NotNull(message="Extension is required")
    @Length(max=10, message = "Extension must be less than 10 characters")
    private String extension;

    @NotEmpty(message="Job Title is required")
    private String jobTitle;

    private Integer vacationHours;

    private String profileImageURL;

    //we're going to make this datatype an integer bc we want to write to the db as an integer
    private Integer reportsTo;

    @NotNull(message = "Office selection is required")
    private Integer officeId;
}
