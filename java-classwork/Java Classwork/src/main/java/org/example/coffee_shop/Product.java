package org.example.coffee_shop;

public class Product {

    private double price;
    private String name;
    private boolean beverage;
    private int QuantityAvailable;


    public Product() {

    }

    public Product(double price, String name, boolean beverage, int quantityAvailable) {
        this.price = price;
        this.name = name;
        this.beverage = beverage;
        this.QuantityAvailable = QuantityAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeverage() {
        return beverage;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }

    public int getQuantityAvailable() {
        return QuantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        QuantityAvailable = quantityAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", beverage=" + beverage +
                ", quantityAvailable=" + QuantityAvailable +
                '}';
    }
}
