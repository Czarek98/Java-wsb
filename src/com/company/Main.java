package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

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

        // Cars

        Car alfa = new Diesel("Alfa Romeo", "147", 2008, 7000.0);
        Car alfa1 = new Electric("Alfa Romeo", "147", 2003, 7000.0);
        Car alfa2 = new LPG("Alfa Romeo", "147", 2005, 7000.0);

/* REFUEL
        System.out.println(alfa.fuel);
        alfa.refuel();
        System.out.println();
        alfa1.refuel();
        System.out.println();
        alfa2.refuel();
        System.out.println();
*/

        Human me = new Human(3);
        me.firstname = "Cezary";
        me.lastname = "Bohdanowicz";
        me.pet = dog;
        Phone xiaomiNajlebrze = new Phone("xiaomi", "jakies", 2020, 0.1, me);
        Human brat = new Human(2);
        brat.firstname = "Moj";
        brat.lastname = "Brat";
        me.setCar(alfa);
        me.setCar(alfa1);
        me.setCar(alfa2);


        //Farmin
        /*

        System.out.println(dog);
        dog.feed(1.0);

        dog.feed();
        System.out.println(dog);


        cow.feed(20.0);
        cow.beEaten();
        cow.feed(20.0);
        System.out.println();

         */

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


        // APPS

//
//        String[] appNames = {"TwarzoKsiazka", "Our Class", "Bimber, not Tinder"};
//
//        try {
//            me.phone.installAnnApp(appNames[0], "1.0");
//            System.out.println();
//            me.phone.installAnnApp("łazap");
//            System.out.println();
//            me.phone.installAnApp(appNames);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }


//        try {
//            alfa2.Sell(me, brat, 199.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        alfa2.ifAsoldB(me, brat);
//        System.out.println(alfa2.numberOfTransactions());

        Aplications twarzoksiazka = new Aplications("twarzoksiazka", 1.0, 0.0);
        Aplications bimber = new Aplications("bimber", 1.0, 0.0);
        Aplications mario = new Aplications("mario w lewa strone", 1.0, 5.0);
        Aplications gta = new Aplications("gta sosnowiec", 1.0, 1.0);
        Aplications gadugadu = new Aplications("gadu gadu", 1.0, 0.0);


        xiaomiNajlebrze.installAnApp(bimber);
        xiaomiNajlebrze.installAnApp(mario);
        xiaomiNajlebrze.installAnApp(gta);
        xiaomiNajlebrze.installAnApp(twarzoksiazka);
        xiaomiNajlebrze.installAnApp(gadugadu);


        xiaomiNajlebrze.sortAppsByLetters();
        System.out.println("------------------------------");
        xiaomiNajlebrze.sortAppsByPrice();
        System.out.println("------------------------------");

        try {
            xiaomiNajlebrze.allFreeApps();
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("------------------------------");
        System.out.println("Price of all apps: " + xiaomiNajlebrze.sumUpAppsPrice());

    }

}

