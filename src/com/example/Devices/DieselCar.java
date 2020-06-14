package com.example.Devices;

public class DieselCar extends Car {
    public DieselCar(String model, String brand, int year, Double engine, int value) {
        super(model, brand, year, engine, value);
    }

    @Override
    public void refuel() {
        System.out.println("yum yum give me that good environment destroying nectar of the trees(because that's where oil comes from not dinosaurs)");
    }

    @Override
    public String toString() {
        return "I will destroy the Earth and eat your soul";
    }

    @Override
    public void sell() throws Exception {
        System.out.println("THANKS FOR BUYING A DIESEL YOU WORTHLESS SCUM YOU'RE JUST KILLING THE ENVIRONMENT!!");
    }

    @Override
    public void buy(Object obj, Object obj2, double price) throws Exception {

    }

    @Override
    public void turnOn() {
        System.out.println("VROOM VROOM I SHALL DESTORY YOUR PLANET MUAHAHAHAHA");
    }
}
