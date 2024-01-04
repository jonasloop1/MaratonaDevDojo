package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        System.out.println("---------------------------------");
        dataBaseLoader.load();
        dataBaseLoader.remove();
        System.out.println("---------------------------------");
        fileLoader.load();
        fileLoader.remove();
        System.out.println("---------------------------------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("---------------------------------");
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
