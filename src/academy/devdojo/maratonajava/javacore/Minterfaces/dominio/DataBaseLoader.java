package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados...");
    }
}
