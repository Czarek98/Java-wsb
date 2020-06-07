package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.*;

public class Human extends Animal {
    public Phone phone;
    public String firstname;
    public String lastname;
    public Pet pet;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    private Double cash = 200.0;
    public Set<Car> cars;


    public Human(Integer garageSize) {

        super("homo sapiens");
        this.cars = new HashSet<Car>();
    }


    private Double salary = 1800.0;
    private Double rise_salary = 200.0;

    public String toString() {
        return this.species + this.firstname + " " + this.lastname + ", " + this.pet + ", " + this.cars;
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

        Car[] vechicle = new Car[cars.size()];
        cars.toArray(vechicle);
        return vechicle[placesForCars];

    }

    public Collection<Car> thisCars() {
        return this.cars;
    }

    public void setCar(Car car) {

        this.cars.add(car);
        car.owners.add(this);
    }

    @Override
    public void feed() {

    }


    public double valueOfCars() {
        Double sum = 0.0;
        Iterator<Car> i = this.cars.iterator();
        return sum;
    }

    public boolean hasCar(Car newCar) {
        return this.cars.contains(newCar);
    }

    public boolean hasFreeSpace() {

        return true;
    }


    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public void addCar(Car car) {
        if (this.hasFreeSpace()) {
            this.cars.add(car);
            car.owners.add(this);
        } else {
            System.out.println("You have no space in garage");
        }
    }

    public boolean owner(Car car) {
        return car.owners.get(car.owners.size() - 1) == car.owners.get(car.owners.size() - 1);
    }

}
