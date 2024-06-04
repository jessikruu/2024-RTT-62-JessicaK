package org.example.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Orders {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_id")
    private String customerID;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "required_date")
    private String requiredDate;

    @Column(name = "shipped_date")
    private String shippedDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comments")
    private String comments;
}
