package academy.devdojo.maratonajava.javacore.Rdatas;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1708547382781L); //Trabalha com long
        System.out.println(date);
        // Date conta o tempo a partir de milissegundos;
        // A maioria dos métodos estão obsoletos;
        // Hoje em dia essa classe está em desuso (Obsoleto).
    }
}
