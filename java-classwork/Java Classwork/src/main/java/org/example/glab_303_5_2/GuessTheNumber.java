package org.example.glab_303_5_2;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 101);
        Scanner in = new Scanner(System.in);

        int guess = -1;
        while (guess != number) {
            System.out.println("\n Enter your guess:");
            guess = in.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            }    else if (guess > number) {
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }

        }




    }
}
