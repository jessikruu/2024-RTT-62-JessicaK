package org.example.glab_303_3_1;

public class Teststringcomparison3 {
    public static void main(String[] args) {

        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = "Perschola";
        String s4 = "PerscholasX";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
