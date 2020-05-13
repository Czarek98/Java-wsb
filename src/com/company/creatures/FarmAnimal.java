package com.company.creatures;

import com.company.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("You were tasty");
        this.weight = 0.0;
    }

    @Override
    public void feed() {

    }
}
