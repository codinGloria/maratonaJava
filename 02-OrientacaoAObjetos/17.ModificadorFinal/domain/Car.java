package com.codingloria.oop.finalModifier.domain;

public final class Car {

    // A final class cannot be the superclass of another class.
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println("Car: " + this.name);
        // A final method cannot be overridden.
    }

    /* Another ways to declare a constant:
    1. using initializer block:
        {
            SPEED_LIMIT = 250;
        }
    - This way, the constant is initialized when the class is loaded.

    2. using a static initializer block:
        static {
            SPEED_LIMIT = 250;
        }

    3. using a constructor:
        public Car() {
            SPEED_LIMIT = 250;
        }
    - This way, the constant is initialized when an object is created.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
