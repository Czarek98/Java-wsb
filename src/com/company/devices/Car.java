package com.company.devices;

public class Car {
    public final String brand;
    public final String model;
    public final Integer yearOfproduction;
    public final Double price;


    public Car(String brand, String model, Integer yearOfproduction, Double price) {
        this.brand = brand;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
        this.price = price;
    }
    public String toString(){
        return "Car " + this.brand + " " + this.model + " " + this.yearOfproduction + " " + this.price;
    }


}
