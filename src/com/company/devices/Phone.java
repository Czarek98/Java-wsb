package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    static final String DEFAULT_APP_SERVER = "https:myappstore.com";
    static final String DEFAULT_PROTOCOL = "https";
    static final Integer DEFAULT_NAME_OF_VERSION = 1;

    public Phone(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    public String toString() {
        return "Phone " + super.toString();
    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Transaction remain succesfull" + this + "was sold to: " + buyer.firstname);
            } else {
                throw new Exception("Give it back!");
            }
        } else {
            throw new Exception("Not enough money");
        }
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String nameOfApp : appNames) {
            installAnnApp(nameOfApp);
        }

    }

    public void installAnnApp(String nameOfApp) throws MalformedURLException {
        installAnnApp(nameOfApp, "latest");
    }

    public void installAnnApp(String nameOfApp, String version) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL,
                DEFAULT_APP_SERVER,
                DEFAULT_NAME_OF_VERSION,
                nameOfApp + " version: " + version);
        installAnnApp(url);
    }

    public void installAnnApp(URL url) {
        System.out.println("App " + url.getFile() + " was installed");
    }

}

