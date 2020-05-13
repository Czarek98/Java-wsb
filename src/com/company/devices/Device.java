package com.company.devices;

import com.company.salleable;

public abstract class Device implements salleable {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public Double price = 1200.0;

    public Device(String brand, String model, Integer yearOfproduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
    }

    public String toString() {
        return brand + " " + model;
    }

    public abstract void turnON();


}
