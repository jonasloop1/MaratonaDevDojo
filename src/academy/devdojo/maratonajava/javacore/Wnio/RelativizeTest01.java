package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalhando com a classe NIO, Relativize;
 *
 * */
import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/jonas");
        Path clazz = Paths.get("/home/jonas/devDojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println("\n" + pathToClazz + "\n");

        Path absoluto1 = Paths.get("/home/documentos");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/documentos/devDojo/OlaMundo.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp1.exe");

        System.out.println("1 - " + absoluto1.relativize(absoluto3));
        System.out.println("2 - " + absoluto3.relativize(absoluto1));
        System.out.println("3 - " + absoluto1.relativize(absoluto2));
        System.out.println("4 - " + absoluto2.relativize(absoluto3));
        System.out.println("5 - " + relative1.relativize(relative2));
        System.out.println("6 - " + relative2.relativize(relative1));
        try {
            System.out.println("7 - " + absoluto1.relativize(relative2)); //O java não conseguem encontra o 'temp' porque é um caminho relativo
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "O java não conseguem encontra o 'temp' porque é um caminho relativo");
        }
    }
}