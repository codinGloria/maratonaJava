package com.codingloria.introducao.aula07;

public class Arrays03 {
    public static void main(String[] args) {
        // Other ways to declare arrays:
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // Other way to iterate over an array:
        for (int num : numbers3) {
            System.out.println(num);
        }
    }
}
