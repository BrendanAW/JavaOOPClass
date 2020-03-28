package com.example;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;

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

}
