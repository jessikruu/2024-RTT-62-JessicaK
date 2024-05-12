package org.example.glab_303_3_1_Hacker_Rank;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverseString = "";
//        Given a string , print Yes if it is a palindrome, print No otherwise.


        int n = A.length();

        for (int i = n - 1; i>=0; --i) {
            reverseString = reverseString + A.charAt(i);
        }

        if (A.toLowerCase().equals(reverseString.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
