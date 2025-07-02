package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1CD2FC", "Samsung");
        Smartphone s2 = new Smartphone("1CDFA2", "Xiami");
        Smartphone s3 = new Smartphone("1CDASD", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); //alterando a posição através do indice


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        //Verificar se determinado conteúdo está no banco de dados
        Smartphone s4 = new Smartphone("1CDASD", "Pixel");
        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4); //retorna o indice
        System.out.println(smartphones.get(indexSmartphone4));

    }
}