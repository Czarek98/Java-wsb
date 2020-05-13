package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    public Phone phone;
    public String firstname;
    public String lastname;
    Animal pet;
    public Car car;
    private Double cash = 200.0;

    public Human(String species, String firstname, String lastname) {
        super("homo sapiens");
    }

    private Double salary = 1800.0;
    private Double rise_salary = 200.0;

    public String toString() {
        return this.species + this.firstname + " " + this.lastname + ", " + this.pet + ", " + this.car;
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
        this.rise_salary =rise_salary;
        if (rise_salary<0){

            System.out.println("You cant do that ");

        }
        else {
            System.out.println("Your money was sent to system accountant ");
            System.out.println("You must collect the annex to the contract from Ms. Hania from the staff ");
            System.out.println("ZUS and US already know about the change in payment. It makes no sense to hide your income :) ");
            double v = salary + rise_salary;
            System.out.println("Your rise was " + rise_salary + " and now your salary is " + v);

            return v;

        }
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
