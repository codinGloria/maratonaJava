package com.codingloria.oop.inheritance.test;

import com.codingloria.oop.inheritance.domain.Employee;

public class InheritanceTest02 {
    public static void main(String[] args) {

        /* ======== Execution order ========
         0. The superclass initialization block is executed when the JVM loads the superclass
         1. The subclass initialization block is executed when the JVM loads the subclass
         2. Memory space is allocated for the superclass object
         3. Each superclass attribute is created and initialized with default values or the values assigned
         4. Superclass initialization block is executed in the order it appears in the class
         5. Superclass constructor is executed
         6. Memory space is allocated for the subclass object
         7. Each subclass attribute is created and initialized with default values or the values assigned
         8. Subclass initialization block is executed in the order it appears in the class
         9. Subclass constructor is executed
         */

        Employee employee = new Employee("Haru");
    }
}
