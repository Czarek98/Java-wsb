package com.company.devices;

public class Electric extends Car {
    public Electric(String brand, String model, Integer yearOfproduction, Double price) {
        super(brand, model, yearOfproduction, price);
    }

    @Override
    public void refuel() {
        this.fuel = DEFAULT_ELECTRIC_AMOUNT + 1;
        System.out.println(
                "Your amount of baterry is now: " + fuel + " hour drive" +
                        "\nQuiet " +
                        "\nNo vroom vroom " +
                        "\nCables and lot of charging.");

    }


}
