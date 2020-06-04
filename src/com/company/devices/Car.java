package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device implements Comparable<Car> {
    static final Double DEFAULT_ELECTRIC_AMOUNT = 0.0;
    static final Double DEFAULT_DIESEL_AMOUNT = 0.0;
    static final Double DEFAULT_LPG_AMOUNT = 0.0;
    public Double fuel;

    public Car(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand, model, yearOfproduction, price);


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
        if (!seller.hasCar(this) &&
                !buyer.hasFreeSpace() &&
                buyer.getCash() < price) {

            throw new Exception("Why " + buyer.firstname + " and " + seller.firstname + " even meet ?");
        }

        if (!seller.hasCar(this)) {
            throw new Exception("There is no any car");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception(buyer.firstname + " has no space");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Not enough money !");
        }


        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println(seller.firstname + " sold " + this + " to: " + buyer.firstname);
    }

    public void refuel() {

    }

    public Double sumUpValue(Integer[] cars) {
        for (Integer placesForCars : cars) {
            sumUpValue(cars);
        }
        return price;
    }

    @Override
    public int compareTo(Car o) {
        return (this.yearOfproduction - o.yearOfproduction);
    }
}
