package org.example.pa_303_4_1;

import java.util.Scanner;

public class ControlFlow5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = in.nextInt();

        if (grade <= 100 && grade >= 90) {
            System.out.println("Congrats girly, you got an A!!");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("My man, you got a B!");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("I'll seeee you later with that C grade");
        } else if (grade <=69 && grade >= 60) {
            System.out.println("Hey mama welcome to the 60's!");
        } else {
            System.out.println("See me after class");
        }

    }
}
