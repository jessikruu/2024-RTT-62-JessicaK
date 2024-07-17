package com.example.springboot.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDetailsBean {

    private Integer productId;
    private String productName;
    private Integer quantityOrdered;
    private Double priceEach;



}
