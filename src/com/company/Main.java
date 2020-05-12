package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Brutus";


        Animal lion= new Animal("lion");
        lion.name = "leo";

        Human me = new Human();
        me.firstname = "Czarek";
        me.lastname = "Bohdanowicz";
        me.pet = dog;


        Car alfa = new Car("Alfa Romeo", "147", 2004, 7000.0);
        Car alfa1 = new Car("Alfa Romeo", "147", 2004, 7000.0);
        me.setCar(alfa);
        Phone xiaomiNajlebrze = new Phone("xiaomi","jakies",2020, 0.1);

        System.out.println(alfa);
        System.out.println(alfa1);

        System.out.println(dog);
        System.out.println(me.pet);

        System.out.println();

        alfa.turnON();
        xiaomiNajlebrze.turnON();


    }
}
