package com.example.Creature;

import com.example.Devices.Car;

public class Human extends Animal {
    String firstName;
    String lastName;
    Pet pet;
    Car car;

    private static String PASS = "pass";
    private Double salary;

    public Human(String name) {
        super("human", name);
        salary = 10.0;
    }

    public Double getSalary(String pass) {
        if (pass.equals(PASS))
            return salary;
        else
            return null;
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
