package academy.devdojo.maratonajava.javacore.Vio;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Classe fileWriter e os seus métodos.
 * */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O melhor curso de DESENVOLVIMENTO do Mundo!\nO melhor curso de DESENVOLVIMENTO do Mundo!");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}