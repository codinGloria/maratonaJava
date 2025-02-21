package com.codingloria.oop.introducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("----------------------");
        // estudante.nome = "Goku"; -> O valor a ser impresso será Goku, e afetará o valor original
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
