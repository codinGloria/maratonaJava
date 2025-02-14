package com.codingloria.introducao.aula06;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprimir os primeiros 25 números de um dado valor.

        int valorMax = 50;
        for (int i = 1; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
