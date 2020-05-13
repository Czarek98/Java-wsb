package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Brutus";


        Animal lion = new Animal("lion");
        lion.name = "leo";

        Car alfa = new Car("Alfa Romeo", "147", 2004);
        Human me = new Human("homo sapiens ", "Czarek", "Bohdanowicz");
        me.pet = dog;
        me.setCar(alfa);

        Phone xiaomiNajlebrze = new Phone("xiaomi", "jakies", 2020);

        Human brat = new Human("homo sapiens", "Moron", "Stupid");
        me.phone = new Phone("xiaomi", "jakies", 2020);

        System.out.println(dog);
        System.out.println(me.pet);

        alfa.turnON();
        xiaomiNajlebrze.turnON();

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


    }
}
