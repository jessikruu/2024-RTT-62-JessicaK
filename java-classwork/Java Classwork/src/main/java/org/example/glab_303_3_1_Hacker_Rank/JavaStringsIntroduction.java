package org.example.glab_303_3_1_Hacker_Rank;

import java.util.Scanner;

public class JavaStringsIntroduction {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        int length = A.length() + B.length();
        System.out.println(length);

        int compare = A.compareTo(B);
        if (compare <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        String Aa = A.substring(0, 1).toUpperCase() + A.substring(1);
        System.out.print(Aa + " ");
        String Bb = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(Bb);


    }


}
