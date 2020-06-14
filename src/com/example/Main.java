package com.example;

import com.example.Creature.Human;
import com.example.Creature.Pet;
import com.example.Devices.Car;
import com.example.Devices.DieselCar;
import com.example.Devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet rex = new Pet("dog", "Rex");
        System.out.println(rex);
        Human bill = new Human("Bill");
        System.out.println(bill);
        Human billette = new Human("Billette");
        bill.setPet(rex);
        billette.setPet(bill.getPet());
        String realKey = "pass";
        String fakeKey = "fail";

        System.out.println(rex);
        bill.getSalary(fakeKey);
        bill.getSalary(realKey);
        try {
            bill.buy(bill, billette, 10.0);
        } catch (Exception ignored) {
        }
        bill.buy(bill, rex, 5.0);

        Phone myPhone = new Phone("Samsung", "Galaxy", 8.1, 50);
        System.out.println(myPhone);
        myPhone.turnOn();
        myPhone.installAnApp("FHub");

        Car car = new DieselCar("F150", "Ford", 2001, 7.1, 5);
        System.out.println(car);
        car.addOwner(bill);

        rex.feed();
    }
}
