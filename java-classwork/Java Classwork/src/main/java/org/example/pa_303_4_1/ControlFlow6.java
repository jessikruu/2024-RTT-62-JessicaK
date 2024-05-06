package org.example.pa_303_4_1;

import java.util.Scanner;

public class ControlFlow6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 7");
        int number = in.nextInt();

        if (number < 1 || number > 7) {
            System.out.println("Nice try, please re-enter your number and keep it between 1 and 7!!");
            number = in.nextInt();
        }
        switch (number) {
            case 1 :
                System.out.println("It is Sunday!");
                break;
            case 2 :
                System.out.println("It is Monday!");
                break;
            case 3 :
                System.out.println("It's Tuesday!");
                break;
            case 4 :
                System.out.println("It's Wednesday!");
                break;
            case 5 :
                System.out.println("Today is Thursday");
                break;
            case 6 :
                System.out.println("Today is Friday");
                break;
            case 7 :
                System.out.println("Saturdaaaay");
                break;
        }

    }
}
