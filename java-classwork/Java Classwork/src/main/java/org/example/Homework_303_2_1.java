package org.example;

public class Homework_303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables,
        // assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum of " + sum);

        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        double d1 = 123.4;
        double d2 = 567.8;

        double dsum = d1 + d2;
        System.out.println("The sum of " + dsum);

        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int a = 30;
        double b = 50.55;
        double sum3 = a + b;
        System.out.println(sum3);

        //Write a program that declares two integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal.
        // What happens? What corrections are needed?

        int v1 = 5;
        int v2 = 2;
        double div = (double) v1 / (double) v2;

        System.out.println(div);

        //Write a program that declares two double variables,
        // assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result.
        // Now, cast the result to an integer. Print out the result again.

        double d3 = 123.4;
        double d4 = 567.8;

        double dsum1 = d4 / d3;

        System.out.println(dsum1);

        int dsum1Int = (int) dsum1;

        System.out.println(dsum1Int);

        //Write a program that declares two integer variables, x and y,
        // and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;

        int q = y/x;

        System.out.println(q);

        double q1 = (double) x;
        double q2 = (double) y / (double) x;
        double q3 = (double) y / x;

        System.out.println(q2);
        System.out.println(q3);

        //Write a program that declares a named constant and uses it in a calculation.
        //Print the result.

        final int INCHES = 12;
        final int FEET = 6;

        int heightInInches = INCHES * FEET;

        System.out.println(heightInInches);

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and
        // totalSale and complete an “order” for three items of the first product, four items
        // of the second product, and two items of the third product. Add them all together to
        // calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the
        // subtotal to obtain the totalSale amount. Be sure to format the results to two decimal
        // places

        int pastry = 3;
        int espresso = 2;
        int water = 1;

        int subtotal = ((pastry * 3) + (espresso * 4) + (water * 2));
        final double SALES_TAX = .08;
        double totalSale = (subtotal * SALES_TAX) + subtotal;

        System.out.println(totalSale);

















    }
}
