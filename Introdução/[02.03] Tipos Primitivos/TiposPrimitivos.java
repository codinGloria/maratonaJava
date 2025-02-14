package com.codingloria.maratonaJava.introducao;

public class Aula10TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, bite, short, long, boolean

        int idade = (int) 10000000000L; // usando CAST
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 22;
        long numeroGrande = 28022002L;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Glória";

        System.out.println("Minha idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println("char: " + caractere);
        System.out.println(salarioFloat);
        System.out.println("Oie! Meu nome é " + nome);
    }
}
