package com.codingloria.oop.introducaoMetodos.test;

import com.codingloria.oop.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do calculadoraTeste04");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        /*
         A variável que é passada para o método é uma cópia do valor da variável original.
         Portanto, a variável original não é alterada.
         O método alteraDoisNumeros não altera o valor das variáveis num1 e num2. porque
        */
    }
}
