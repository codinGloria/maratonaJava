package com.codingloria.introducao.aula07;

public class Arrays01 {
    public static void main(String[] args) {
        int age01 = 22;
        int age02 = 24;
        int age03 = 21;

        // We can use arrays to store multiple values of the same type:

        int[] ages = new int[3];
        ages[0] = age01;
        ages[1] = age02;
        ages[2] = age03;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        /* The default values for arrays are:
         *  byte, short, int, long, float, double -> 0
         *  char -> '\u0000' ' '
         *  boolean -> false
         *  string -> null
         */
    }
}
