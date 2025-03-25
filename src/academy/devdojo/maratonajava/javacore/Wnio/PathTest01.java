package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalhando com a classe NIO, path, paths e files.
 *
 * */

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
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