package com.codingloria.introducao.aula08;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 ... Months
        // 31, 28, 31, 30 ... Days

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("--------------------");
        System.out.println("Using enhanced for loop");

        for (int[] arrBase : days) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
