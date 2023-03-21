package com.spring.day4;

public class Product {
    private String name;
    private int price;

    public Product(final String name, final int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
