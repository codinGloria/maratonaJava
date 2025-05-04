package com.codingloria.oop.staticModificator.test;

import com.codingloria.oop.staticModificator.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        // Indepedent of the object, the limitSpeed (static) will be the same for all objects
        Car.setLimitSpeed(180);

        Car car1 = new Car("Omega CD", 200);
        Car car2 = new Car("Astra", 180);
        Car car3 = new Car("Vectra", 220);

        car1.print();
        car2.print();
        car3.print();
    }
}
