package com.company;

public class Aplications implements Comparable<Aplications> {
    public String name;
    public Double version;
    public Double price;

    public Aplications(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Aplications price) {
        if (this.price == price.getPrice())
            return 0;
        else if (this.price > price.getPrice())
            return 1;
        else
            return 0;
    }


}
