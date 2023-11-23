package com.workintech.store.models;

public class Bread extends ProductForSale {
    boolean isFresh;

    public Bread(String type, double price, String description, boolean isFresh) {
        super(type, price, description);
        this.isFresh = isFresh;
    }

    public boolean isFresh() {
        return isFresh;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details: Type: "+getType() + " Price: "+getPrice()+" Description: "+getDescription()+" IsFresh : "+isFresh());
    }
}
