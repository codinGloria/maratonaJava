package com.codingloria.introducao.aula07;

public class Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Luffy";
        names[1] = "Zoro";
        names[2] = "Robin";
        names[3] = "Nami";

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "º name: " + names[i]);
        }

        // When we resize the array, the values are lost, and the default values are assigned.
        names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "º name: " + names[i]);
        }
    }
}
