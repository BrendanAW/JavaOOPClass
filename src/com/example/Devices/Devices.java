package com.example.Devices;

public abstract class Devices {
    final String producer;
    final String model;
    int value;

    public Devices(String producer, String model, int value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    public abstract void turnOn();

    public int getValue() {
        return this.value;
    }
}
