package com.company;

import java.io.File;

public class Animal implements salleable {
    String name;
    String species;
    Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 120.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
    }

    public String toString() {
        return "Pet " + this.name + " " + this.species + " " + this.weight;
    }

    void feed() {
        if (weight != 1 && weight > 0) {

            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("Sorry you cant feed your dead pet.");
        }
    }

    void walk() {
        if (weight != 1 && weight > 0) {
            weight--;
            System.out.println("thx for food bro, my weight is now " + weight);

        } else {
            System.out.println("Sorry you cant walk.");
        }
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Come on man, you cant do this!");
        } else {
            if (buyer.getCash() >= price) {
                if (seller.pet == this) {
                    buyer.pet = this;
                    seller.pet = null;
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                } else {
                    throw new Exception("Give it back!");
                }
            } else {
                throw new Exception("Not enough money");
            }
        }
    }
}
