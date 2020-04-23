package com.company;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    Animal pet;
    Car car;

    private  Double salary = 1800.0;
    private  Double rise_salary = 200.0;



    public Double getSalary() {
        Date nowDate = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println("Your rise was sent: " + sdf3.format(nowDate));
        //System.out.println("Your rise is " + rise_salary);
        System.out.println("Your salary was: " + salary);

        return salary;
    }

    public Double setSalary() {
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
}
