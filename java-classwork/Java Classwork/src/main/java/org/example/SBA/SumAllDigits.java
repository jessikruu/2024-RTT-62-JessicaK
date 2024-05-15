package org.example.SBA;

import java.io.*;

public class SumAllDigits {

    public static int getDigitsSum(int largeNumber) {
        int sum = 0;
        for (int num = largeNumber; num != 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }

}
