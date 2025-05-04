package com.codingloria.exercicios.oop.introducaoMetodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        System.out.println("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        if (salarios == null) {
            return;
        }
        System.out.println("\n----------------------");

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média salarial: " + media);
    }
}
