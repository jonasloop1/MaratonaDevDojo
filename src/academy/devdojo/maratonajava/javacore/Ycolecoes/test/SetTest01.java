package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Coleções usando Set, HashSet e linkedHashSet
 *
 * */
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>(); //Set é uma coletion e uma interface que não permite elementos duplicados dentro da coleção
        mangas.add(new Manga(5L, "Pokemon", 10.9, 0));
        mangas.add(new Manga(3L, "Dragon ball Z", 9.99, 5));
        mangas.add(new Manga(8L, "Attack on titan", 20.00, 0));
        mangas.add(new Manga(2L, "Berserk", 50.9, 2));
        mangas.add(new Manga(4L, "Naruto", 40.60, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
