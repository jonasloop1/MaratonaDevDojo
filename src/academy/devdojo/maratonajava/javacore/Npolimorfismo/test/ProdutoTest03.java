package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        //Fazendo referencia de um classe pai para uma classe filha

        Produto produto = new Computador("Razi 9", 23000);
        Tomate tomate = new Tomate("Tomate americano", 23);
        tomate.setDataValidade("11/09/2021");

        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calculadoraImposto(produto);
    }
}
