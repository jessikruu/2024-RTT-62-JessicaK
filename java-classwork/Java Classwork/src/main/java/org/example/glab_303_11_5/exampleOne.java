package org.example.glab_303_11_5;

import java.util.HashSet;

public class exampleOne {

    public static void main(String[] args) {

        HashSet<Integer> evenNumber = new HashSet<>();
        //using add method

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        //usaing addall method

        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New Hashset: " + numbers);
    }
}
