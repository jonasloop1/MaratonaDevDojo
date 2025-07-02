package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Coleções.
 *
 * */

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1CD2FC", "Samsung");
        Smartphone s2 = new Smartphone("45HUYH", "Xiaomi");

        System.out.println(s1.equals(s2));
    }
}
