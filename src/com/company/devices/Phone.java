package com.company.devices;

import com.company.Aplications;
import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device {

    static final String DEFAULT_APP_SERVER = "https:myappstore.com";
    static final String DEFAULT_PROTOCOL = "https";
    static final Integer DEFAULT_NAME_OF_VERSION = 1;
    public Set<Aplications> apps;
    public Human user;

    public Phone(String brand, String model, Integer yearOfproduction, Double price, Human user) {
        super(brand, model, yearOfproduction, price);
        this.apps = new TreeSet<Aplications>();
        this.user = user;

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

    public void installAnApp(Aplications app) {
        if (user.getCash() < app.getPrice()) {
            System.out.println("Not enough money");
        }
        user.setCash(user.getCash() - price);
        this.apps.add(app);
        System.out.println(app.name + " was successful installed");

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

    public void sortAppsByLetters() {
        List<Aplications> applications = new ArrayList<>(apps);
        Collections.sort(applications);
        System.out.println("Applications sorted A-Z: ");

        for (int i = 0; i < applications.size(); i++) {
            System.out.println(applications.get(i));
        }
    }

    public void sortAppsByPrice() {
        List<Aplications> app = new ArrayList<>(apps);
        app.sort(Aplications::compareTo);
        System.out.println("Applications sorted by price: " + app);
    }

    public void allFreeApps() throws Exception {
        for (Aplications app : apps) {
            if (app.price == 0.0) {
                System.out.println(app.name);
            }
        }
    }

    public double sumUpAppsPrice() {
        double sum = 0;

        for (Aplications app : apps) {
            sum = app.price + app.price;
        }

        return sum;
    }

    public void ifAppWasInstalled(Aplications appObject) {
        if (this.apps.contains(appObject)) {
            System.out.println(appObject.getName() + " was installed");
        } else {
            System.out.println("There is no " + appObject.getName());
        }
    }


    public void ifAppWasInstalled(String appName) {
        for (Aplications app : apps) {
            if (appName == app.name) {
                System.out.println("Your app was installed");
            } else {
                System.out.println("There is no app");
            }
        }

    }

}


