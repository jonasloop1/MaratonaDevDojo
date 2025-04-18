package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalha com diretórios.
 *
 * */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> strem = Files.newDirectoryStream(dir)) {
            for (Path path : strem) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}