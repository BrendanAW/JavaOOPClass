package com.example;

import com.example.Creature.Animal;
import com.example.Creature.Human;
import com.example.Creature.Pet;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet rex = new Pet("dog","Rex");
        Human bill = new Human("Bill");
        Human billette = new Human("Billette");
        bill.setPet(rex);
        billette.setPet(bill.getPet());
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
