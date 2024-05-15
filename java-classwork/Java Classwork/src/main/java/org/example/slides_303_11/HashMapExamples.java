package org.example.slides_303_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key", "value");
        stringMap.put("key2", "value2");
        stringMap.put(null, "actual value");
        stringMap.put("null value", null);
        stringMap.put("null value 1", null);

        //this is adding null a second time, which will overwrite the existing value
        stringMap.put(null, "1234");

        //it will overwrite a non-null value as well
        stringMap.put("key", "1234");






        String value = stringMap.get("key");
        System.out.println(value);


        //common way of looping over a map
        for( String key : stringMap.keySet()) {
            String value1 = stringMap.get(key);
            System.out.println(key + " == " + value1);
        }


        //  key is integer, string is value
        Map<Integer, String> intMap = new HashMap<>();
        intMap.put(10, "ten");


        //this happens sometimes but usually there are other ways of solving problems
        //this would be a work around or a hak for allowing duplicate values for key
        //this takes a bit of extra work to implement, but if you need this then you need it
        //this is a good example of a dictionary, bc the first key is the word, then the list is/are the multiple definitions
        Map<String, List<String>> listMap = new HashMap<>();
        listMap.put("Streets", new ArrayList<String>());
        listMap.get("Streets").add("Street 1");
        listMap.get("Streets").add("Street 2");

        listMap.put("Avenue", new ArrayList<String>());

        System.out.println(listMap);
        //{Avenue=[], Streets=[Street 1, Street 2]}

        //this happens when working with ad hoc queries
        //this is going to happen far more often than the map of list
        //when it comes back from the database this way, we just treat it as a read only object
        List<Map<String, Object>> queryResult;


    }
}
