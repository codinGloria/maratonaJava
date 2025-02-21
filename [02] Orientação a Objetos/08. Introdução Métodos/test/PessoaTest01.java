package com.codingloria.oop.introducaoMetodos.test;

import com.codingloria.oop.introducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sanji");
        pessoa.setIdade(26);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
