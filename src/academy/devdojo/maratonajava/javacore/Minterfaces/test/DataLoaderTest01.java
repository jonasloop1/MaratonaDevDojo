package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DataBaseLoader dataBaseLoader = new DataBaseLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();

        fileLoader.load();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
