package org.knit.solutions.lab2_1.task2;


public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public int getCalories() {
        return 5;
    }
}
