package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * BasicFileAttributes -> interface geral
 * DosFileAttributes -> Implementação
 * PosixFileAttributes -> voltado para sistemas Unix
 *
 * */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //Alterando atributo de um arquivo - modo antigo:
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/novo.txt");
        boolean isCreatedFile = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        //Alterando atributo de um arquivo - modo novo:
        Path path = Paths.get("pasta/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
    }
}
