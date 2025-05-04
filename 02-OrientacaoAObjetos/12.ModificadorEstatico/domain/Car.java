package com.codingloria.oop.staticModificator.domain;

public class Car {
    private String name;
    private double maxSpeed;

    // The static attribute is shared by all objects of the class
    private static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("-----------------");
        System.out.println("Name: " + name);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Limit speed: " + Car.limitSpeed);
    }

    // Static methods can be called without creating an object
    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
