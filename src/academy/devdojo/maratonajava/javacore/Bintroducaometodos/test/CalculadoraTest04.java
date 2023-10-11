package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 50;
        int b = 25;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTest4");
        System.out.println("Numero 1: " + a);
        System.out.println("Numero 2: " + b);
    }
}
