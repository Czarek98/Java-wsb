package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog") {

        };
        dog.name = "Brutus";

        Animal lion = new Animal("lion") {
            @Override
            public void feed() {

            }
        };
        lion.name = "leo";

        FarmAnimal cow = new FarmAnimal("cow");

        Car alfa = new Car("Alfa Romeo", "147", 2004);
        Human me = new Human("homo sapiens ", "Czarek", "Bohdanowicz");
        me.pet = dog;
        me.setCar(alfa);

        Phone xiaomiNajlebrze = new Phone("xiaomi", "jakies", 2020);

        Human brat = new Human("homo sapiens", "Moron", "Stupid");
        me.phone = new Phone("xiaomi", "jakies", 2020);

        System.out.println(dog);
        dog.feed(1.0);

        dog.feed();
        System.out.println(dog);


        cow.feed(20.0);
        cow.beEaten();
        cow.feed(20.0);

//REAL SELLING
/*
        try {
            //me.car.Sell(me, brat, 199.0);
            //me.phone.Sell(me, brat, 5.0);
            //me.pet.Sell(me, brat, 2.0);
            brat.Sell(me, brat, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Moj samochod " + me.getCar());
        System.out.println("Samochod brata " + brat.getCar());
        System.out.println("Moja forsa " + me.getCash());
        System.out.println("Forsa brata " + brat.getCash());
        System.out.println("moj fon " + me.phone);
        System.out.println("fon brata " + brat.phone);
        System.out.println("moj zwierzak " + me.pet);
        System.out.println("brata zwierzak " + brat.pet);
*/

    }
}
