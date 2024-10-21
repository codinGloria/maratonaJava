package com.codingloria.maratonaJava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos: + - * /
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        System.out.println(numero01 + numero02);
        System.out.println(numero01 - numero02);
        System.out.println(numero01 * numero02);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores Lógicos: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20? " + isDezIgualVinte);
        System.out.println("10 é igual a 10? " + isDezIgualDez);
        System.out.println("10 é diferente de 10? " + isDezDiferenteDez);

        // Operadores Lógicos: && (AND) || (OR) ! (NOT)
        int idade = 22;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println("Está dentro da lei para maiores que 30? " + isDentroDaLeiMaiorQue30);
        System.out.println("Está dentro da lei para menores que 30? " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStation5Compravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println(isPlayStation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0

        System.out.println(bonus);

        // incremento e decremento
        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
