package com.example.Devices;

import com.example.Creature.Human;
import com.example.Sellable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Devices implements Sellable, Comparable<Car> {
    private int year;
    private Double engine;
    private List<Human> owners;

    public Car(String model, String brand, int year, Double engine, int value) {
        super(brand, model, value);
        owners = new ArrayList<>();
        this.year = year;
        this.engine = engine;
    }

    @Override
    public void buy(Object obj, Object obj2, double price) throws Exception {
        throw new Exception("Cars can't buy things");
    }

    @Override
    public int compareTo(Car o) {
        return o.year - this.year;
    }

    public abstract void refuel();

    public void addOwner(Human human) {
        owners.add(owners.size(), human);
    }

    public boolean wereYouInMe(Human human) {
        return owners.contains(human);
    }

    public boolean didHeSellMeToYou(Human human1, Human human2) {
        if (owners.contains(human1)) {
            return owners.get(owners.indexOf(human1) + 1).equals(human2);
        }
        return false;
    }

    public int howManyTimesHaveIBeenPassedAround() {
        return owners.size() - 1;
    }
}
