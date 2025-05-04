package com.codingloria.oop.finalModifier.test;

import com.codingloria.oop.finalModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);

        car.BUYER.setName("John");
        System.out.println(car.BUYER);

    }
}
