package org.example;

import org.example.database.entity.Customers;

public class EqualsDemo {

    public static void main(String[] args) {

        Customers c1 = new Customers();

        c1.setId(1);
        c1.setCustomerName("Martin");


        Customers c2 = new Customers();
        c2.setId(1);
        c2.setCustomerName("Martin");


        if ( c1.equals(c2)) {
            System.out.println("Both customers are the same");
        } else {
            System.out.println("The customers are different");
        }


    }
}
