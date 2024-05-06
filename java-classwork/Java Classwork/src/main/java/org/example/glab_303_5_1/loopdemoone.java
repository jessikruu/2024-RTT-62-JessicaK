package org.example.glab_303_5_1;

public class loopdemoone {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        int sum = 0;
        int z = 1000;

        for (int a = 1; a <= n; ++a) {

            sum += a;
        }
        System.out.println("Sum = " + sum);
    }
}
