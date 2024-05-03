package org.example.glab_303_2_1;

import java.sql.SQLOutput;

public class AssignmentOperatorsDemo {

    public static void main(String[] args) {

        //Assigning primitive values
        int j, k;
        j = 10;
        j = 5;
        k = j;
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);

        k = j = 10;
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);
    }

}
