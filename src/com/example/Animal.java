package com.example;

import java.io.File;

public class Animal {
    public String name;
    final String specie;
    private Double weight;
    File pics;

    public Animal(String specie) {
        this.specie = specie;
        setWeight();
    }

    private void setWeight() {
        if (this.specie.equals("dog"))
            weight = 10.0;
        else if (this.specie.equals("lion"))
            weight = 30.0;
        else
            weight = 15.5;
    }

    Double feed() {
        System.out.println("thanks for feeding me!");
        return ++weight;
    }

    void walk() {
        if (weight > 4.0) {
            System.out.println("yay walks!");
            --weight;
        } else if (weight > 1.0) {
            System.out.println("Feed me.");
            --weight;
        } else {
            System.out.println("Bro I'm ded.");
        }
    }

    @Override
    public String toString() {
        return "The good boy" + name;
    }
}
