package com.company;

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
        me.getSalary(1500.0);
        me.setCar(alfa);



    }
}
