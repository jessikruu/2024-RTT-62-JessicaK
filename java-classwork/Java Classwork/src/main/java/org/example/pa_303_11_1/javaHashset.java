package org.example.pa_303_11_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javaHashset {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            String line = sc.nextLine();
            set.add(line);
            System.out.println(set.size());
        }
    }

}
