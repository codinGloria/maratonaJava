package com.codingloria.oop.introducaoClasses.test;

import com.codingloria.oop.introducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Glória";
        estudante.idade = 22;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
