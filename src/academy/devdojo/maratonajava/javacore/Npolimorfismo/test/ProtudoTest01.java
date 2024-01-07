package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProtudoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 10000);
        Tomate tomate = new Tomate("Tomate verde", 20);
        Televisao tv = new Televisao("Samsung 60\" ", 50000);

        CalculadoraImposto.calculadoraImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calculadoraImposto(tv);
    }
}
