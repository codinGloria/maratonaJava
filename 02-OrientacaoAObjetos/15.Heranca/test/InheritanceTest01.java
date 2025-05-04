package com.codingloria.oop.inheritance.test;

import com.codingloria.oop.inheritance.domain.Address;
import com.codingloria.oop.inheritance.domain.Employee;
import com.codingloria.oop.inheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua das Flores");
        address.setCep("12345-678");

        Person person = new Person("Legoshi");
        person.setCpf("123.456.789-00");
        person.setAddress(address);
        person.print();

        Employee employee = new Employee("Haru");
        employee.setCpf("987.654.321-00");
        employee.setAddress(address);
        employee.setSalary(5000.0);
        employee.print();
    }
}
