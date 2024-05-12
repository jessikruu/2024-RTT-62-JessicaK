package org.example.pa_303_5_1;

import java.util.Scanner;

public class GCDFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two positive integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Both numbers must be positive.");
            return;
        }

        int gcd = findGCD(n1, n2);
        System.out.println("The gcd is " + gcd);
    }

    private static int findGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return findGCD(n2, n1 % n2);
        }
    }
}
