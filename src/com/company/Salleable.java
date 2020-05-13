package com.company;

import com.company.creatures.Human;

public interface Salleable {
    void Sell(Human seller, Human buyer, Double price) throws Exception;
}
