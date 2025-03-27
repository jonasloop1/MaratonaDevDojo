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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Criando diretorio
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        //Vatagem de usar o "createDirectories" é que ele já cria outras subpastas caso não exista!
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectories = Files.createDirectories(subPastaPath);

        //Criando arquivo dentro das subPastas
        Path filePath = Paths.get(subPastaPath.toString(), "Arquivo.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        //Renomeando arquivo
        //source = origem
        //target = destino

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}