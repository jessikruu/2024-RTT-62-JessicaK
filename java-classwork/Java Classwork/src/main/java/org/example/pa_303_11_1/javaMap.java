package org.example.pa_303_11_1;

import java.util.HashMap;
import java.util.Scanner;

public class javaMap {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int nRecords = Integer.parseInt(sc.nextLine());

        HashMap<String, Integer> phoneBook = createPhoneBook(nRecords);

        for (int i = 0; i < nRecords; i++) {
            String name = sc.nextLine();
            isInPhoneBook(name, phoneBook);
        }
    }

    private static void isInPhoneBook(String name, HashMap<String, Integer> book) {
        if (book.containsKey(name)) {
            System.out.println(name + "=" + book.get(name));
        } else {
            System.out.println("Not found");
        }
    }

    private static HashMap<String, Integer> createPhoneBook(int numRecords) {
        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < numRecords; i++) {
            String name = sc.nextLine();
            int phoneNumber = Integer.parseInt(sc.nextLine());
            phoneBook.put(name, phoneNumber);
        }
        return phoneBook;
    }
}
