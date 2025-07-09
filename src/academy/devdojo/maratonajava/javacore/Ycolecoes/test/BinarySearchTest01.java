package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param BinarySearch é outra forma de fazer buscas numa coleção ou arrayLista;
 * A diferença entre o indexOf eo binary search, é que o binarySerch
 * retorna a posição que deveria inserir determinado elemento caso ele não exista!
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //(-(ponto de inserção)-1)
        //índice 0,1,2,3
        //valor 0,2,3,4

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2)); //Só é possivel usar o binarySearch em listas ordenadas
    }
}