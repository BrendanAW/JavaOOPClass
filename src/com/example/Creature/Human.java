package com.example.Creature;

import com.example.Devices.Car;

public class Human extends Animal {
    String firstName;
    String lastName;
    Pet pet;
    Car[] garage;

    private static String PASS = "pass";
    private Double salary;

    public Human(String name) {
        super("human", name);
        salary = 10.0;
        garage = new Car[4];
    }

    public Double getSalary(String pass) {
        if (pass.equals(PASS))
            return salary;
        else
            return null;
    }

    public int sumCarValues() {
        int value = 0;
        for (Car car : this.garage)
            value += car.getValue();
        return value;
    }

    public boolean addCarToGarage(Car car) {
        if (garage[garage.length - 1] != null || carInGarage(car)) {
            System.out.println("Hey you already have a full garage!!\nOr you already have that car, either way you can't add it!!");
            return false;
        }
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                return true;
            }
        }
        return false;
    }

    public void removeCarFromGarage(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                System.out.println("Car removed!!!");
            }
        }
        System.out.println("Car not found, nothing happened...");
    }

    @Override
    public void setSalary(Double salary, String pass) {
        if (pass.equals(PASS) && salary > 0) {
            this.salary = salary;
            System.out.println("Salary has been changed to: " + this.salary);
        } else
            System.out.println("No change to salary.");

    }

    @Override
    public String toString() {
        return firstName;
    }

    @Override
    public void sell() throws Exception {
        throw new Exception("you can't sell people ya prick");
    }

    @Override
    public double feed(double foodAmt) {
        if (this.weight > 15) {
            System.out.println("No I really shouldn't, I'm on a diet");
            return this.weight;
        } else return alive ? this.weight += foodAmt : 0.0;
    }

    public boolean buyCar(Car car) {
        if (salary > car.getValue()) {
            if (addCarToGarage(car)) {
                salary -= car.getValue();
                car.addOwner(this);
                return true;
            }
        }

        System.out.println("You can't afford that car, no deal!");
        return false;
    }

    public void sellCar(Human human, Car car) {
        if (carInGarage(car)) {
            removeCarFromGarage(car);
            System.out.println("The car has left your garage");
            if (human.buyCar(car)) {
                System.out.println("Transaction is complete!!");
            } else {
                System.out.println("You got your car back! That dirty hobo didn't have the money to pay you!!");
                addCarToGarage(car);
            }
        }
    }

    public boolean carInGarage(Car car) {
        for (Car c : garage) {
            if (c.equals(car))
                return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
