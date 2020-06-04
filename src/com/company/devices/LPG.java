package com.company.devices;

public class LPG extends Car {
    public LPG(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand, model, yearOfproduction, price);
    }

    @Override
    public void refuel() {
        this.fuel = DEFAULT_LPG_AMOUNT + 1;
        System.out.println(
                "Your amount of fuel is now: " + fuel + " L" +
                        "\nThe cheapest... " +
                        "\nYou're not gonna pick up girls with it... " +
                        "\nunless you Pudzian with that Hummer in LPG");

    }


}



