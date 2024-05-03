package org.example.Slides_303_4;

public class IfStatements {
    public static void main(String[] args) {

        int x = 10;
        x = test(x);


        if (x < 10) {
            System.out.println("Less than 10" + (x < 10)); // the second part will print as a true/false
        } else if (x < 20) {
            System.out.println("Less than 20");
        } else if (x < 30) {
            System.out.println("Less than 30");
        } else {
            System.out.println("Greater than 30");
        }

//        int i = 1, j = 2, k = 3;
//        if (i > j) {
//            if (i > k)
//                System.out.println("A");
//        } else System.out.println("B");

        //correct below
        int i = 1;
        int j = 2;
        int k = 3;
        if (i > j) {
            if (i > k) {
                System.out.println("A");
            }
        } else {
            System.out.println("B");
        }

    }

    public static int test(int x) {

        x = x + 1;
        return x;

    }
}
