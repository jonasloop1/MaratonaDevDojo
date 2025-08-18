package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param conversão de lista para Arrays
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        System.out.println("--- Convertendo uma lista para um Array: ---");
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("--- Convertendo um Array para uma Lista: ---");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);//Faz um link com o array
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray) + " Array");
        System.out.println(arrayToList + " Lista");

        System.out.println("--- Convertendo um Array para uma Lista, sem link entre o arrayList e o Array: ---");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));//Desse forma o link entre o Array e a lista é quebrada
        numerosList.add(3, 22);
        numerosList.add(4, 67);
        numerosList.add(5, 100);
        System.out.println(numerosList);

        //Criando lista em uma unica linha:
//        Arrays.asList("p");
        List<String> nomes = List.of("Jonas", "João", "Rafael");//Faz a mesma coisa do Arrays.asList("p");
        System.out.println("\n Lista de nomes: " + nomes);
    }
}