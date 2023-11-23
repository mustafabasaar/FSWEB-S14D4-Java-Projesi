package com.workintech.store.models;

public abstract class ProductForSale {
String type;
double price;
String description;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getSalesPrice(int quantity){
        return quantity * this.price;
    }
    public abstract void showDetails();


}
