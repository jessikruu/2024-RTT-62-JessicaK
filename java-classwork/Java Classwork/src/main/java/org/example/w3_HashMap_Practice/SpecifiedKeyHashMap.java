package org.example.w3_HashMap_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpecifiedKeyHashMap {
    public static void main(String[] args) {

        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        Map<Integer, String> specifiedValue = new HashMap<>();
        specifiedValue.put(1, "Honda");
        specifiedValue.put(2, "Ford");
        specifiedValue.put(3, "Toyota");
        specifiedValue.put(4, "Chevy");


        //2. Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("The size of the map is " + specifiedValue.size());


        //3. Write a Java program to copy all mappings from the specified map to another map.

        HashMap<Integer, String> specifiedValue2 = new HashMap<>();

        specifiedValue2.put(10, "Shogun");
        specifiedValue2.put(20, "Fallout");
        specifiedValue2.put(30, "Breaking Bad");
        specifiedValue2.put(40, "Stranger Things");

        specifiedValue2.putAll(specifiedValue);

        System.out.println("The combined maps are- " + specifiedValue2);

        //4. Write a Java program to remove all mappings from a map.
//        System.out.println("The current map is- " + specifiedValue2);
//
//        specifiedValue2.clear();
//
//        System.out.println("The cleared map is- " + specifiedValue2);

        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        boolean result = specifiedValue2.isEmpty();

        System.out.println("Is it empty? " + result);

        //6. Write a Java program to get a shallow copy of a HashMap instance.

        System.out.println("The current map is- " + specifiedValue2);

        HashMap<Integer, String> newSpecifiedValue = new HashMap<Integer, String>();
        newSpecifiedValue = (HashMap)specifiedValue2.clone();
        System.out.println("Cloned map: " + newSpecifiedValue);

        //7. Write a Java program to test if a map contains a mapping for the specified key.

        System.out.println("The current map is- " + newSpecifiedValue);

        System.out.println("Does the map contain 30? ");

        if (newSpecifiedValue.containsKey(30)) {
            System.out.println("yes! " + newSpecifiedValue.get(30));
        } else {
            System.out.println("NO! ");
        }

        //8. Write a Java program to test if a map contains a mapping for the specified value.

        System.out.println("Does the map contain Shogun? ");

        if (newSpecifiedValue.containsValue("Shogun")) {
            System.out.println("yes! ");
        } else {
            System.out.println("NO!");
        }

        //9. Write a Java program to create a set view of the mappings contained in a map.
        Set set = newSpecifiedValue.entrySet();
        System.out.println("Set values- " + set);

        //10. Write a Java program to get the value of a specified key in a map.
        String val = (String)newSpecifiedValue.get(3);
        System.out.println("Value for key 3 is- " + val);

        //11. Write a Java program to get a set view of the keys contained in this map.
        Set keyset = newSpecifiedValue.keySet();

        System.out.println("Key set values are- " + keyset);

        //12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("Collection view is- " + newSpecifiedValue.values());



    }
}
