package com.example.springboot.form;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {

    private Integer customerId;

    @NotEmpty(message="Customer Name is required")
    private String customerName;

    @NotEmpty(message="First Name is required")
    private String contactLastName;

    @NotEmpty(message="Last Name is required")
    private String contactFirstName;

    @NotEmpty(message="Phone Number is required")
    private String phone;

    @NotEmpty(message="Address is required")
    private String address1;

    private String address2;

    @NotEmpty(message="City is required")
    private String city;

    private String state;

    private String zipCode;

    @NotEmpty(message="Country is required")
    private String country;

    private Integer salesRepEmployeeID;

    private Double creditLimit;


}
