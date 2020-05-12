package com.company.devices;

public abstract class Device {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public Double price;

    public Device(String brand, String model, Integer yearOfproduction, Double price){
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
        this.price = price;
    }

    public String toString() {
        return brand + " " + model;
    }

    public abstract void turnON();


}
