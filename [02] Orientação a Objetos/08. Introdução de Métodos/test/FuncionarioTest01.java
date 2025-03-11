package com.codingloria.oop.introducaoMetodos.test;

import com.codingloria.oop.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Zoro");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1000, 1200, 1500});
        funcionario.imprime();
    }
}
