package org.example.pa_303_11_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Creating List to store integers
            List<Integer> l1 = new ArrayList<Integer>(Integer.parseInt(br.readLine()));
            // Input list elements
            String lines = br.readLine();
            // Extracting List elements
            String[] strs = lines.trim().split("\\s+");
            // Adding elements to the list
            for(int i=0; i < strs.length; i++){
                l1.add(i, Integer.parseInt(strs[i]));
            }
            // Input No of Queries
            int query = Integer.parseInt(br.readLine());

            // Executing Queries
            while(query>0){
                String action = br.readLine();
                String index = br.readLine();
                String[] newStr = index.trim().split("\\s+");

                if(action.equals("Insert")){
                    l1.add(Integer.parseInt(newStr[0]),Integer.parseInt(newStr[1]));
                } else if (action.equals("Delete")){
                    l1.remove(Integer.parseInt(newStr[0]));
                }
                query--;
            }

            for(int j = 0;j < l1.size(); j++){
                System.out.print(l1.get(j) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
