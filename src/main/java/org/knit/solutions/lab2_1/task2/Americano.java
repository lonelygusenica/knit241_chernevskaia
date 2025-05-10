package org.knit.solutions.lab2_1.task2;


public class Americano implements Coffee {
    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Американо";
    }

    @Override
    public int getCalories() {
        return 10;
    }
}
