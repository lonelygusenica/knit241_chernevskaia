package org.knit.solutions.lab2_4.task13;

public class TV {
    private final String location;
    public TV(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println("Телевизор в " + location + " включен.");
    }
    public void off() {
        System.out.println("Телевизор в " + location + " выключен.");
    }
}