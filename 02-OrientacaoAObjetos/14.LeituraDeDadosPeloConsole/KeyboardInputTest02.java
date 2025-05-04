package com.codingloria.oop.association.test;

import java.util.Scanner;

public class KeyboardInputTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The great future prediction software!");
        System.out.println("Enter your question and I will answer it with a yes or no.");
        String question = sc.nextLine();
        if (question.charAt(0) == ' '){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
