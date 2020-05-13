package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device {


    public Car(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    public String toString() {
        return "Car " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Vroom vroom");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.car == this) {
                buyer.car = this;
                seller.car = null;
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println(seller.firstname + " sold " + this + " to: " + buyer.firstname);
            } else {
                throw new Exception("Give it back!");
            }
        } else {
            throw new Exception("Not enough money");
        }
    }
}
