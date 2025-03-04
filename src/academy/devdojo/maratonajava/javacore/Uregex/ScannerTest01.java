package academy.devdojo.maratonajava.javacore.Uregex;

public class ScannerTest01 {
    public static void main(String[] args) {
        //Tokens e Delimitadores.
        String texto = "Levi- look- Law - true - 300";
        String[] nomes = texto.split("-");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}