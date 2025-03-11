package com.codingloria.oop.introducaoClasses.test;

import com.codingloria.oop.introducaoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 1000;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + ", idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}
