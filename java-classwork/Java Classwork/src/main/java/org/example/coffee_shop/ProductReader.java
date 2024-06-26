package org.example.coffee_shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {


    public List<Product> readProducts() {

        List<Product> products = new ArrayList<>();

        try {
            File file = new File("products.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);



//            String header = bufferedReader.readLine();
//            String product = bufferedReader.readLine();
//
//            System.out.println(header);
//            System.out.println(product);
//
//            Product p = parseProduct(product);


            String line = bufferedReader.readLine();

            line = bufferedReader.readLine();

            while (line != null) {
                Product p = parseProduct(line);
                products.add(p);
                line = bufferedReader.readLine();
            }

//            System.out.println("We read in " + products.size() + " products");
//            for (Product p : products) {
//                System.out.println(p);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;

    }

    private Product parseProduct(String line) {
        //    0     , 1  , 2, 3   (position)
        //Chai Latte,2.99,10,true

        Product result = new Product();

        String[] column = line.split(",");
        result.setName(column[0]);

        double price = Double.parseDouble(column[1]);
        result.setPrice(price);

        Integer quantity = Integer.parseInt(column[2]);
        result.setQuantityAvailable(quantity);

        Boolean beverage = Boolean.parseBoolean(column[3]);
        result.setBeverage(beverage);

        return result;
    }

}
