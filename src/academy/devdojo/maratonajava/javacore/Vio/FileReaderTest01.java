package academy.devdojo.maratonajava.javacore.Vio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Classe fileRead e os seus métodos, usa a tabela ASCI.
 * */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)) {
            //opção colocando um buffer de CHAR:

//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("Retorna a quantidade de caracteres lidos dentro do array: " + size);
//            for (char c : in) {
//                System.out.print(c);
//            }

            //opção interando sobre o array:
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}