package org.example;

import java.util.Locale;

public class StringExampl {
    public static void main(String[] args){

        String str = "Hey girl hey";

        System.out.println("The length of the string = " + str.length());

        String str1 = str.toUpperCase();

        System.out.println("In uppercase, it looks like - " + str1);

        String str2 = str.toLowerCase();

        System.out.println("This is what it looks like in lower case - " + str2);

        String fileName = "Hello.java";

        System.out.println("The file name is " + fileName + " and the length is " + fileName.length());

        System.out.println("The period is at index " + fileName.indexOf('.'));

        System.out.println("The file extension is " + fileName.substring(fileName.indexOf('.')));

        System.out.println("The name of the file is " + fileName.substring(0, fileName.indexOf('.')));

    }
}
