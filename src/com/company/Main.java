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

        System.out.println("Your " + me.pet.species + " default weight is: " + me.pet.weight);

        me.pet.feed();

        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();

        me.pet.feed();

        //System.out.println(me.pet.name);
    }
}
