package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Usando NavigableSet, TreeSet não verifica se dois elementos são iguais.
 *
 * */

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangarPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangarPrecoComparator());
        mangas.add(new Manga(5L, "Pokemon", 10.9, 0));
        mangas.add(new Manga(3L, "Dragon ball Z", 9.99, 5));
        mangas.add(new Manga(8L, "Attack on titan", 20.00, 0));
        mangas.add(new Manga(2L, "Berserk", 50.9, 2));
        mangas.add(new Manga(4L, "Naruto", 40.60, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        //Métodos:
        // lower < retorna o menor imediatemente
        // floor <=
        // higher >
        // ceiling >=
        Manga yuyu = new Manga(33L, "Yuyu Hashuso", 15, 10);
        System.out.println("-----------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("Tamanho da lista: " + mangas.size());
        System.out.println(mangas.pollFirst()); //pollFirst() - Retorna o primeiro elemento da lista e depois remove
        System.out.println(mangas.pollLast()); //pollLast() - Retorna o último elemento da lista e depois remove
        System.out.println("Tamanho da lista depois das remoções: " + mangas.size());
    }
}