package com.example.Devices;

public class ElectricCar extends Car {
    public ElectricCar(String model, String brand, int year, Double engine, int value) {
        super(model, brand, year, engine, value);
    }

    @Override
    public void refuel() {
        System.out.println("I will save you and the world, but not that efficiently as everyone things because ion batteries are really toxic to make, you should really just be using a bike man.");
    }

    @Override
    public String toString() {
        return "Broom broom it's electric";
    }

    @Override
    public void sell() throws Exception {
        System.out.println("YOU BEAUTIFUL BASTARD YOU'RE SAVING THE PLANET AREN'T YOU, YOU CHEEKY MINGING TWAT");
    }
}
