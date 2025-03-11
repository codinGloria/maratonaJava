package com.codingloria.oop.introducaoMetodos.test;

import com.codingloria.oop.introducaoMetodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Mirko";
        estudante01.idade = 33;
        estudante01.sexo = 'F';

        estudante02.nome = "Hawks";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
