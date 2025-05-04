package com.codingloria.introducao.aula06;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 28000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                continue;
            }

            System.out.printf("Parcela %d x de R$ %.2f%n", parcela, valorParcela);
        }
    }
}
