package academy.devdojo.maratonajava.javacore.Vio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalhando com criação de diretórios e arquivos.
 *
 * */

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("Pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio foi criado? " + isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "Arquivo.txt");
        boolean isArquivoCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo foi criado? " + isArquivoCreated);

        File fileRenamed = new File(fileDiretorio, "Arquivo_renomeado.txt");
        boolean isArquivoRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo foi renomeado? " + isArquivoRenamed);

        File diretorioRenamed = new File("PastaRenomeada");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio foi renomeado? " + isDiretorioRenamed);
    }
}