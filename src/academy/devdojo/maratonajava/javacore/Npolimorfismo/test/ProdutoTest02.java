package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        //Fazendo referencia de um classe pai para uma classe filha
        Produto produto = new Computador("Razi 9", 23000);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Valor do imposto: " + produto.calcularImposto());
        System.out.println("--------------------------");
        Produto produto1 = new Tomate("Tomate americano", 23);
        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getValor());
        System.out.println("Valor do imposto: " + produto1.calcularImposto());
    }
}
