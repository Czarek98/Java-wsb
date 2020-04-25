package com.company;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    Animal pet;
    private Car car;

    private  Double salary = 1800.0;
    private  Double rise_salary = 200.0;

    public Car getCar() {
        return car;
    }

    public Double getSalary(Double salary) {
        this.salary =salary;
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
            this.rise_salary =rise_salary;
            System.out.println("Your money was sent to system accountant ");
            System.out.println("You must collect the annex to the contract from Ms. Hania from the staff ");
            System.out.println("ZUS and US already know about the change in payment. It makes no sense to hide your income :) ");
            double v = salary + rise_salary;
            System.out.println("Your rise was " + rise_salary + " and now your salary is " + v);

            return v;

        }
        return salary;
    }

    public void setCar(Car alfa){
        if (alfa.prize <= this.salary){
            System.out.println("Yay, now you don't have to ride with your parents.");
            this.car = alfa;
        }
        else if (alfa.prize <= (this.salary*12)){
            System.out.println("Great, you got a car but you don't have money for fuel.");
            this.car = alfa;
        }
        else {
            System.out.println("Just get a job.");
        }
    }
}
