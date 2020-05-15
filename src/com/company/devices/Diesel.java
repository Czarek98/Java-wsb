package com.company.devices;

public class Diesel extends Car {
    public Diesel(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);
    }

    @Override
    public void refuel() {

        this.fuel = DEFAULT_DIESEL_AMOUNT + 1;

        System.out.println(
                "Your amount of fuel is now: " + fuel + " L" +
                        "\nNot so cheap " +
                        "\nLong distance " +
                        "\nSmoke everything behind. like snoop dogg");

    }
}
