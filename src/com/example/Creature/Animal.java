package com.example.Creature;

import com.example.Edible;
import com.example.Sellable;

public class Animal implements Sellable, Edible, Feedable {
    public String name;
    final String specie;
    Double weight;
    double price;
    double salary = 10;
    Boolean alive = true;

    public Animal(String specie, String name) {
        this.specie = specie;
        this.name = name;
        setWeight();
    }

    public Animal(String specie) {
        System.out.println("We created a new animal");
        this.specie = specie;

        switch (specie) {
            case "dog":
                weight = 10.0;
                break;
            case "lion":
                weight = 12.0;
                break;
            default:
                weight = 7.0;
                break;
        }
    }

    private void setWeight() {
        if (this.specie.equals("dog"))
            weight = 10.0;
        else if (this.specie.equals("lion"))
            weight = 30.0;
        else
            weight = 15.5;
    }

    @Override
    public double feed() {
        return feed(1.0);
    }

    @Override
    public double feed(double foodAmt) {
        if (!this.alive) {
            System.out.println("Your animal is already dead :(");
            return 0.0;
        }
        if (foodAmt < 0) {
            System.out.println("You gotta give me some food man!");
            return this.weight;
        }
        System.out.println("thanks for feeding me!");
        return this.weight += foodAmt;
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

    void setSalary(Double salary, String pass) {
        if (!(this instanceof Human)) {
            System.out.println("You can't have a salary!!!");
            return;
        }
    }

    @Override
    public String toString() {
        return "The good " + this.specie + " " + this.name;
    }

    @Override
    public void sell() throws Exception {
    }

    @Override
    public void buy(Object obj, Object obj2, double price) throws Exception {
        if (obj2 instanceof Human)
            throw new Exception("You can't buy people");
        assert obj instanceof Animal;
        if (price > ((Animal) obj).salary)
            System.out.println("You can't afford to buy: " + obj2.toString());
        else {
            System.out.println("You purchased: " + obj2.toString() + " for " + price + " bucks");
            ((Animal) obj).salary -= price;
            System.out.println("Your new salary is : " + ((Animal) obj).salary);
        }


    }

    @Override
    public void eat(Animal animal) throws Exception {
        if (animal instanceof Pet)
            throw new Exception("You can't eat animals");
        else if (animal.alive) {
            System.out.println("That " + animal.specie + " was tasty!");
            animal.beEaten();
        } else
            System.out.println("there is no animal to be eaten, he already gone son");

    }

    @Override
    public void beEaten() {
        this.alive = false;
    }
}
