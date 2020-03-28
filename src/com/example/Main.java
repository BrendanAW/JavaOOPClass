package com.example;

public class Main {

    public static void main(String[] args) {
        Animal rex = new Animal("dog");
        Human bill = new Human();
        Human billette = new Human();
        bill.firstName = "Bill";
        bill.pet = rex;
        billette.firstName = "Billette";
        billette.pet = bill.pet;
        String realKey = "pass";
        String fakeKey = "fail";

        System.out.println(rex);


    }
}
