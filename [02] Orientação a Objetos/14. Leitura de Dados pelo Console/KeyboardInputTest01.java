package com.codingloria.oop.association.test;

import java.util.Scanner;

public class KeyboardInputTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // String next = sc.next(); // read a single word
        String nextLine = sc.nextLine(); // read a line

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // read an integer

        System.out.print("Enter F or M: ");
        char sex = sc.next().charAt(0); // read a character

        System.out.println("------------------");
        System.out.println("Name: " + nextLine);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);

    }
}
