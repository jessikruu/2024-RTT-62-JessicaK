package org.example;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args){

        Scanner sc1 = new Scanner (System.in);
        //System.in means to scan the input from the keyboard
        System.out.println("Enter a number: ");
        int num1 = sc1.nextInt();
        System.out.println("The number is : " + num1);

        sc1.close();

    }
}
