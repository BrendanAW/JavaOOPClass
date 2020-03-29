package com.example.Devices;

public class DieselCar extends Car {
    public DieselCar(String model, String brand, int year, Double engine) {
        super(model, brand, year, engine);
    }

    @Override
    public void refuel() {
        System.out.println("yum yum give me that good environment destroying nectar of the trees(because that's where oil comes from not dinosaurs)");
    }

    @Override
    public String toString() {
        return "I will destroy the Earth and eat your soul";
    }
}
