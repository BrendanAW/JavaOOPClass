package com.example;

public class Animal implements Sellable {
    public String name;
    final String specie;
    private Double weight;
    double price;
    double salary = 10;

    public Animal(String specie, String name) {
        this.specie = specie;
        this.name = name;
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
}
