package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 10.9, 0));
        mangas.add(new Manga(3L, "Dragon ball Z", 9.99, 5));
        mangas.add(new Manga(8L, "Attack on titan", 20.00, 0));
        mangas.add(new Manga(2L, "Berserk", 50.9, 2));
        mangas.add(new Manga(4L, "Naruto", 40.60, 0));

//        Iterator<Manga> mangasIterator = mangas.iterator();
//        while (mangasIterator.hasNext()){
//            if (mangasIterator.next().getQuantidade() == 0){
//                mangasIterator.remove();
//            }
//        }

        //Usando programação funcional:
        mangas.removeIf(varReferenciaManga -> varReferenciaManga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}