package com.example.Creature;

public class Human extends Animal {
    String firstName;
    String lastName;
    Pet pet;

    private static String PASS = "pass";
    private Double salary;

    public Human(String name) {
        super("human",name);
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
