package com.codingloria.introducao.aula08;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];
        // When we dont know the size of the array,
        // we have the null pointer exception
        // so we need to define the array with the size

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3, 4};
        arrayInt[2] = array;

        int[][] arrayInt2 = {
                {0, 0},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5, 6}
        };

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
