package com.company;

public class Human {
    String firstName;
    String lastName;
    Animal pet;

    private static String PASS = "pass";
    private Double salary;

    public Double getSalary(String pass) {
        if (pass.equals(PASS))
            return salary;
        else
            return null;
    }

    public void setSalary(Double salary, String pass) {
        if (pass.equals(PASS) && salary > 0){
            this.salary = salary;
            System.out.println("Salary has been changed to: " + this.salary);
        }else
            System.out.println("No change to salary.");

    }
}
