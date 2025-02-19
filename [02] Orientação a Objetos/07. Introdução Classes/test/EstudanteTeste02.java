package com.codingloria.oop.introducaoClasses.test;

import com.codingloria.oop.introducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Glória";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("----------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
