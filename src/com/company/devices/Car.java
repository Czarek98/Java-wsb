package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;

public class Car extends Device implements Comparable<Car> {
    static final Double DEFAULT_ELECTRIC_AMOUNT = 0.0;
    static final Double DEFAULT_DIESEL_AMOUNT = 0.0;
    static final Double DEFAULT_LPG_AMOUNT = 0.0;
    static final Integer DEFAULT_TRANSACTION = 0;
    public Integer transaction;
    public Double fuel;
    public ArrayList<Human> owners = new ArrayList<Human>();


    public Car(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand, model, yearOfproduction, price);
        this.owners = new ArrayList<Human>();
        this.transaction = DEFAULT_TRANSACTION;
    }

    public String toString() {
        return "Car " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Vroom vroom");
    }

    public void ownerCheck(Human owner) {
        if (this.owners.contains(owner)) {
            for (Human owners : owners)
                System.out.println(owners.firstname + " " + owners.lastname + ", ");
        } else {
            System.out.println("There is no owner");
        }
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this) &&
                !buyer.hasFreeSpace() &&
                buyer.getCash() < price) {

            throw new Exception("Why " + buyer.firstname + " and " + seller.firstname + " even meet ?");
        }

        if (seller.hasCar(this) && !seller.owner(this)) {
            throw new Exception("You try to sell stolen car");
        }
        if (!seller.hasCar(this)) {
            throw new Exception("There is no any car");
        }
        if (!seller.owner(this)) {
            throw new Exception("You are no owner");
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
        this.owners.add(buyer);
        this.transaction = this.transaction + 1;
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

    public boolean wasOwner(Human owner) {
        return this.owners.contains(owner);
    }

    public void ifAsoldB(Human a, Human b) {
        if (wasOwner(a) && wasOwner(b)) {
            System.out.println("There was such a transaction");
        } else {
            System.out.println("This has never happened");
        }
    }

    public int numberOfTransactions() {
        return this.transaction;
    }
}
