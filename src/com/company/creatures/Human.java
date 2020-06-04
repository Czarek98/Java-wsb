package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    public Phone phone;
    public String firstname;
    public String lastname;
    public Pet pet;
    private static Integer DEFAULT_GARAGE_SIZE = 2;
    private Double cash = 200.0;
    public Car[] garage;


    public Human(Integer garageSize) {

        super("homo sapiens");
        this.garage = new Car[garageSize];
    }


    private Double salary = 1800.0;
    private Double rise_salary = 200.0;

    public String toString() {
        return this.species + this.firstname + " " + this.lastname + ", " + this.pet + ", " + this.garage;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        if (cash < 0) {
            System.out.println("Sorry im not an idiot ");
        } else {
            this.cash = cash;
        }

    }

    public Double getSalary(Double salary) {
        this.salary = salary;
        Date nowDate = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println("Your rise was sent: " + sdf3.format(nowDate));
        //System.out.println("Your rise is " + rise_salary);
        System.out.println("Your salary was: " + salary);


        return salary;
    }

    public Double setSalary(Double rise_salary) {
        this.rise_salary = rise_salary;
        if (rise_salary < 0) {

            System.out.println("You cant do that ");

        } else {
            System.out.println("Your money was sent to system accountant ");
            System.out.println("You must collect the annex to the contract from Ms. Hania from the staff ");
            System.out.println("ZUS and US already know about the change in payment. It makes no sense to hide your income :) ");
            double v = salary + rise_salary;
            System.out.println("Your rise was " + rise_salary + " and now your salary is " + v);

            return v;

        }
        return salary;
    }

    public Car getCar(Integer placesForCars) {

        return garage[placesForCars];
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public void setCar(Car car, Integer placesForCars) {

        this.garage[placesForCars] = car;
    }

    @Override
    public void feed() {

    }


    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.price;
            }
        }
        return sum;
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }


    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
            }
        }
    }

}
