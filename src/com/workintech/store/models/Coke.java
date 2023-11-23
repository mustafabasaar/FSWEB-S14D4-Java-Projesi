package com.workintech.store.models;

public class Coke extends ProductForSale {
    double volume;

    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details: Type: "+getType() + " Price: "+getPrice()+" Description: "+getDescription()+" Volume: "+getVolume());
    }
}
