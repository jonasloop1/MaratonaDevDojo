package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Sort, usado para ordenar os elementos numa lista
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Naruto");

        Collections.sort(mangas); //Coloca em ordem alfabetica para Strings e numerica pra int, long...

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(100.21);
        dinheiros.add(55.65);
        dinheiros.add(654D);
        dinheiros.add(22.49);
        dinheiros.add(5.7);

        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }
}
