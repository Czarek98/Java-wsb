package com.company.creatures;

import com.company.Feedable;
import com.company.Salleable;

import java.io.File;

public abstract class Animal implements Salleable, Feedable {
    static final Double DEFAULT_COW_WEIGHT = 100.0;
    static final Double DEFAULT_PIG_WEIGHT = 100.0;
    public Animal pet;
    public String name;
    public String species;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 120.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public Double weight;
    public Double foodWeight;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species == "cow") {
            this.weight = DEFAULT_COW_WEIGHT;
        } else if (species == "pig") {
            this.weight = DEFAULT_PIG_WEIGHT;
        }
    }

    public String toString() {
        return "Pet " + this.name + " " + this.species + " " + this.weight;
    }

    public void feed(Double foodWeight) {
        if (weight != 1 && weight > 0) {
            //System.out.println("Sorry you cant feed your dead pet.");
            weight = weight + foodWeight;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("Sorry you cant feed dead animals.");
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
                    buyer.pet = (Pet) this;
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
