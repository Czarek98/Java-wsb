package com.company.devices;

import com.company.Salleable;

public abstract class Device implements Salleable {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public Double price;

    public Device(String brand, String model, Integer yearOfproduction, Double price) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
        this.price = price;
    }

    public String toString() {
        return this.brand + " " + this.model + " " + this.yearOfproduction + " " + this.price;
    }

    public abstract void turnON();


}
