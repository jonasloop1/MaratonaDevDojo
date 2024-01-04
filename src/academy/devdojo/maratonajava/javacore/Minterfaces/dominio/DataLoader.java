package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //Atributos em uma interface são sempre constantes
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    default void checkPermission() {
        System.out.println("Checando permissões...");
    }

    //Métodos em interfaces não podem ser sobrescritos!
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface!");
    }
}
