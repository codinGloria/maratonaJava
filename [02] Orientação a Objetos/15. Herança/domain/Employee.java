package com.codingloria.oop.inheritance.domain;

public class Employee extends Person {

    private double salary;

    static {
        System.out.println("Inside Employee static block");
    }

    {
        System.out.println("Inside Employee instance block 1");
    }

    {
        System.out.println("Inside Employee instance block 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Inside Employee constructor");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Salary: " + this.salary);
    }

    public void paymentReport(){
        System.out.println("I, " + this.name + ", received the salary of " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
