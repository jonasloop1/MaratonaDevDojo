package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivos...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivos...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo...");
    }
}
