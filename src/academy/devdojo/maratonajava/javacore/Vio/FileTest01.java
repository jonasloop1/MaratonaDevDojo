package academy.devdojo.maratonajava.javacore.Vio;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Classe file e os seus métodos.
 * */
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criação file: " + isCreated);

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deletando arquivo: " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean isCreated2 = file.createNewFile();
        System.out.println("\nCriando outro arquivo: " + isCreated2);

        System.out.println("\nPath/caminho: " + file.getPath());
        System.out.println("Path/caminho absoluto: " + file.getAbsolutePath());
        System.out.println("Se é um diretório: " + file.isDirectory());
        System.out.println("Se é um arquivo: " + file.isFile());
        System.out.println("Se é um arquivo oculto: " + file.isHidden());
        System.out.println("Quando o arquivo foi modificado: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
    }
}