package com.codingloria.oop.inheritance.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Inside Person static block");
    }

    {
        System.out.println("Inside Person instance block 1");
    }

    {
        System.out.println("Inside Person instance block 2");
    }

    public Person(String name) {
        System.out.println("Inside Person constructor");
        this.name = name;
    }

    public void print(){
        System.out.println("--------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Address: " + this.address.getStreet() + ", CEP: " + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
