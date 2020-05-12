package com.company.devices;

public class Car extends Device {


    public Car(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand,model,yearOfproduction,price);

    }
    public String toString(){
        return "Car " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Vroom vroom");
    }
}
