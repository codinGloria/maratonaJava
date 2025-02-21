package com.codingloria.exercicios.oop.classes;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Omega";
        carro.modelo = "CD";
        carro.ano = 1998;

        carro2.nome = "Opala";
        carro2.modelo = "Diplomata";
        carro2.ano = 1988;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);

        System.out.println("----------------------");

        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

    }
}
