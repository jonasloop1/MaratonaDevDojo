package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Sort, usado para ordenar os elementos numa lista
 *
 * */

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 10.9));
        mangas.add(new Manga(3L, "Dragon ball Z", 9.99));
        mangas.add(new Manga(8L, "Attack on titan", 20.00));
        mangas.add(new Manga(2L, "Berserk", 50.9));
        mangas.add(new Manga(4L, "Naruto", 40.60));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------");
        //Collections.sort(mangas, new MangaByIdComparator());
        //ou
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}