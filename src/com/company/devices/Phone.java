package com.company.devices;

public class Phone extends Device {
    public Phone(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand,model,yearOfproduction,price);

    }
    public String toString(){
        return "Phone " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }
}
