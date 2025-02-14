package com.codingloria.introducao.exercicios;

public class Aula06_Break {
    // Dado um valor de um carro, descubra em quantas parcelas ele pode ser dividido
    // Condição: valor da parcela >= 1000

    public static void main(String[] args) {
        double valorCarro = 28000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.printf("Parcela %d x de R$ %.2f%n", parcela, valorParcela);
        }
    }
}
