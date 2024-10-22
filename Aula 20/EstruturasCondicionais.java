package com.codingloria.maratonaJava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 10;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado.");
        } else {
            System.out.println("Não autorizado.");
        }

        // !
        if (!isAutorizado) {
            System.out.println("Não autorizado.");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca vai ser feito.");
        }

        System.out.println("Fora do if");
    }
}
