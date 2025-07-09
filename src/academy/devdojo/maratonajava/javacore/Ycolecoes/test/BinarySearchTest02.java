package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param BinarySearch é outra forma de fazer buscas numa coleção ou arrayLista;
 * A diferença entre o indexOf eo binary search, é que o binarySerch
 * retorna a posição que deveria inserir determinado elemento caso ele não exista!
 *
 * */

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 10.9));
        mangas.add(new Manga(3L, "Dragon ball Z", 9.99));
        mangas.add(new Manga(8L, "Attack on titan", 20.00));
        mangas.add(new Manga(2L, "Berserk", 50.9));
        mangas.add(new Manga(4L, "Naruto", 40.60));

        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Naruto", 40.60);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}