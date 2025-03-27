package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalhando com a classe NIO, path, paths e files;
 * A interface da path foi criada para substituir a file;
 * Para criar um path você vai precisar usar a classe paths;
 * E ainda existe a classe Files, que não tem nada relacionado com a File;
 * A classe Files tem relação com a classe paths.
 *
 * */

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        //Diferentes formas de encontrar um arquivo
        Path p1 = Paths.get("C:\\Users\\JonasJoao\\Documents\\DevDojo\\MaratonaDevDojo\\file.txt");
        Path p2 = Paths.get("C:\\Users\\JonasJoao\\Documents\\DevDojo\\MaratonaDevDojo", "file.txt");
        Path p3 = Paths.get("C:", "Users", "JonasJoao\\Documents\\DevDojo\\MaratonaDevDojo", "file.txt");
        Path p4 = Paths.get("C:", "Users", "JonasJoao", "Documents", "DevDojo", "MaratonaDevDojo", "file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}