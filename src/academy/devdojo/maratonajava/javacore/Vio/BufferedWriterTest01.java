package academy.devdojo.maratonajava.javacore.Vio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Classe BufferedWriter e os seus métodos, usa a tabela ASCI.
 * OBS: A classe BufferedWriter encapsula a classe FileWriter;
 * E foi criada para ter melhor performace utilizando a mémoria do sistema;
 * */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("DevDojo o melhor curso de DESENVOLVIMENTO do Mundo!");
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}