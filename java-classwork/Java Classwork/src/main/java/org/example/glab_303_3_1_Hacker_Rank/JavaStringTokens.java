package org.example.glab_303_3_1_Hacker_Rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String s1 = s.trim();

        if(s1.length() == 0) {
            System.out.println(s1.length());
            return;
        }

        String[] s2 = s1.split("[\\s+!,?._'@]+");
        System.out.println(s2.length);

        for(String s3 : s2) {
            System.out.println(s3);
        }
    }
}
