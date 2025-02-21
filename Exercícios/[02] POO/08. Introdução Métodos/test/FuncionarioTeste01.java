package com.codingloria.exercicios.oop.introducaoMetodos.test;

import com.codingloria.exercicios.oop.introducaoMetodos.domain.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Glória";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{2100,1700, 1717, 3100};

        funcionario.imprime();
    }
}
