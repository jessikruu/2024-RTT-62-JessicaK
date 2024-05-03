package org.example.Slides_303_4;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {

        //old school for loop
        for (int count = 10; count > 0; count--) {
            if ( count % 2 == 0 ) {
                System.out.println("This is an even number");

                for (int d = 0 ; d < 5 ; d++ ) {
                    System.out.println("The count = " + count + "." + d);
                }
            }
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("First Element");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");

        //we can use an old style for loop to move across this list
        for (int pos = 0; pos < stringList.size() ; pos++) {
            System.out.println(stringList.get(pos));

        }

//        for (String element : StringList) {
//            System.out.println(element);
//        }

    }
}
