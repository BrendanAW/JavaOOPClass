package com.example.Devices;

import com.example.Sellable;

public class Car implements Sellable {
    private String model;
    private String brand;
    private int year;
    private Double engine;
    private double price;

    public Car(String model, String brand, int year, Double engine) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        price = 10.0;
    }

    @Override
    public void sell() throws Exception {

    }

    @Override
    public void buy(Object obj, Object obj2, double price) throws Exception {
        throw new Exception("Cars can't buy things");
    }
}
