package org.example.slides_303_12;

import java.util.Scanner;

public class ExceptionsExamples {

    private Scanner scanner = new Scanner(System.in);
    public int captureInput() {

        while (true ) {
        try {
            System.out.println("enter an array position: ");
            int value = scanner.nextInt();
            return value;
        } catch (Exception e) {
            System.out.println("You must enter a valid integer");
        }
        }
    }



    public void run() {


        int[] array = new int[10];

        try {
            System.out.println("Before error");

            int pos = captureInput();

            //when the exception occurs on this lone, it will automatically jump to the catch block
            array[pos] = 5;

            //any code adter the exception won't run
            System.out.println("After Error - no error occurred ");
        } catch ( Exception e) {
            System.out.println("caught the exception with message " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionsExamples ee = new ExceptionsExamples();
        ee.run();
    }
}
