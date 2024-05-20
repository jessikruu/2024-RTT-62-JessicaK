package org.example.coffee_shop;

import org.example.Question14.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeShop {

    private List<Product> products = new ArrayList<>();

    //building the menu of products for sale at the coffee shop
    public void initProducts() {


        Product smallCoffee = new Product();
        smallCoffee.setPrice(5.46);
        smallCoffee.setName("Small Coffee");
        smallCoffee.setBeverage(true);
        products.add(smallCoffee);

        Product largeCoffee = new Product();
        largeCoffee.setPrice(4.89);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setBeverage(true);
        products.add(largeCoffee);

        Product cakePop = new Product();
        cakePop.setPrice(3.89);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false, 5);
        products.add(eggSandwich);

        Product croissant = new Product(4.62, "Croissant", false, 15);
        products.add(croissant);


        ProductReader pr = new ProductReader();
        List<Product> productsFromFile = pr.readProducts();
        products.addAll(productsFromFile);

    }

    public void printCheapProducts() {
        //this code filters all products less than $5
        List<Product> cheapProducts = products.stream().filter(product -> product.getPrice() < 5). collect(Collectors.toList());

        //this code prints all products less than $5
        cheapProducts.forEach(product -> System.out.println("These products are less than $5 - " + product.getName() + "\t" + product.getPrice()));

        //the sale 2 lines of code written as a for loop
        for (Product product : products) {
            if (product.getPrice() < 5) {
                System.out.println("These products are less than $5 - " + product.getName() + "\t" + product.getPrice());
            }
        }
    }

    public void printProducts() {
        for( int pos = 1 ; pos < products.size() ; pos++) {
            Product product = products.get(pos);
            System.out.println(pos + ") " + product.getName() + "\t" + product.getPrice() );
        }
        int pos = 0;
        products.forEach(product -> {System.out.println(pos + ") " + product.getName() + "\t" + product.getPrice() );});
    }


}
