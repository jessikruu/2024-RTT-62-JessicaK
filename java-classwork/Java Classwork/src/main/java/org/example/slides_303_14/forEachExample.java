package org.example.slides_303_14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class forEachExample {

    public static void main (String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Larry");
        names.add ("Steve") ;
        names.add ("James") ;
        names.add ( "Conan") ;
        names.add ( "Ellen") ;

        //print all names in the list
        names.forEach (name -> {  System.out.println (name);    } );

        System.out.println("======================");

        //same as above but w new style for loop (foreach)
        for (String name : names ) {
            System.out.println(name);
        }


        System.out.println("======================");

        //using lambda to remove items from the list
        names = names.stream().filter(name -> !name.startsWith("E")).collect(Collectors.toList());

        //print the list after the items are removed
        for (String name : names) {
            System.out.println(name);
        }

        //count the number of names in the list that start w J
        long count = names.stream().filter(name -> name.startsWith("J")).count();

        System.out.println("Names in the list that start w J" + count);
    }





}
