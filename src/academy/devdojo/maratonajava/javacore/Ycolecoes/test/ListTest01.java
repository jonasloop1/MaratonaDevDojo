package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param List é uma "interface" de coleções ordenadas.
 *
 * */
public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); //tamanho da capacidade da lista, capacidade inicial 16
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("jonas");
        nomes.add("silva");
        nomes.add("Dev dojo");

        nomes2.add("jonas");
        nomes2.add("silva");
        nomes2.add("Dev dojo");

        nomes.remove(2);

        nomes.addAll(nomes2); //Colocando uma list dentro de outro

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
