package com.example.springboot.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderdetails")

public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "quantity_ordered")
    private Integer quantityOrdered = 0;

    @Column(name = "price_each", columnDefinition = "DECIMAL")
    private Double priceEach = 0.00;

    @Column(name = "order_line_number", columnDefinition = "SMALLINT")
    private Integer orderLineNumber;


}
