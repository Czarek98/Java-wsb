package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    public Phone(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    public String toString() {
        return "Phone " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Transaction remain succesfull" + this + "was sold to: " + buyer.firstname);
            } else {
                throw new Exception("Give it back!");
            }
        } else {
            throw new Exception("Not enough money");
        }
    }
}

