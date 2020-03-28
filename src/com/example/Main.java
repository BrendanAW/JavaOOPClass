package com.example;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal rex = new Animal("dog","Rex");
        Human bill = new Human("Bill");
        Human billette = new Human("Billette");
        bill.firstName = "Bill";
        bill.pet = rex;
        billette.firstName = "Billette";
        billette.pet = bill.pet;
        String realKey = "pass";
        String fakeKey = "fail";

        System.out.println(rex);
        bill.getSalary(fakeKey);
        bill.getSalary(realKey);
        try{
            bill.buy(bill, billette, 10.0);
        }catch (Exception ignored){}
        bill.buy(bill, rex, 5.0);


    }
}
