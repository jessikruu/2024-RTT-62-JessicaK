package org.example.glab_303_2_3;

public class OperatorsAndNumbers {
    public static void main(String[] args) {

        int x = 2;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x <<= 1;
        //20
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 9;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x <<= 1;
        //18
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 17;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x <<= 1;
        //34
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 88;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x <<= 1;
        //176
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 150;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x >>= 2;
        //The right shift operator (>>) moves the bits of the number to the right,
        // effectively dividing the number by 2 for each shift.
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 225;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x >>= 2;
        //56.25
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 1555;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x >>= 2;
        //388.75
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x = 32456;
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        x >>= 2;
        //8114
        System.out.println("Decimal Form: " + x);
        System.out.println("Binary String: " + Integer.toBinaryString(x));

        int y, z;
        x = 7;
        y = 17;

        z = x & y;



    }
}
