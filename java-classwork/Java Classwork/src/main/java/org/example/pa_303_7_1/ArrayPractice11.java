package org.example.pa_303_7_1;

import java.util.Scanner;

public class ArrayPractice11 {
    public static void main(String[] args) {

        int n;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        n = sc1.nextInt();

        String[] array = new String[n];
        System.out.println("Please give me an item");
        for (int i = 0; i < n; i++) {
            array[i] = sc1.next();
        }
        System.out.println("Your favorite things are- ");
        for (int i = 0; i < n; i ++) {
            System.out.print(array[i] + ", ");
        }
    }
}
