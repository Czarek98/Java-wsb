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

        me.car = new Car("Alfa Romeo", "147", 2004);

        //System.out.println(me.car.brand);


    }
}
