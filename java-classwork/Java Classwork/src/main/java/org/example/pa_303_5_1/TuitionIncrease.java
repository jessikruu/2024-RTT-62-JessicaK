package org.example.pa_303_5_1;

public class TuitionIncrease {
    public static void main(String[] args) {
        // Initial tuition
        double tuition = 10000;
        // Annual increase rate
        double increaseRate = 0.07;

        int years = 0;
        while (tuition <= 20000) { // Assuming we want to find out when it doubles or exceeds
            tuition += tuition * increaseRate; // Apply the increase
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}
