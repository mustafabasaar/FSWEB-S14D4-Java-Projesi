package com.workintech.store.models;

public class Chocolate extends ProductForSale {
   ChocolateType type;

    public Chocolate(String type, double price, String description, ChocolateType type1) {
        super(type, price, description);
        this.type = type1;
    }


    public ChocolateType getChocolateType() {
        return type;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details: Type: "+getType() + " Price: "+getPrice()+" Description: "+getDescription()+" ChocolateType: "+getChocolateType());
    }




}
