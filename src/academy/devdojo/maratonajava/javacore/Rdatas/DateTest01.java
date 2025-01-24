package academy.devdojo.maratonajava.javacore.Rdatas;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 *
 * */

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1737678937133L); //Trabalha com long
        date.setTime(date.getTime() + 3_000_000); // Adiciona 1 hora no horário atual
        System.out.println(date);

        Date date1 = new Date();
        System.out.println("\n" + date1.getTime()); //Pega a data atual através do sistema!

        // Date conta o tempo a partir de milissegundos;
        // A maioria dos métodos estão obsoletos;
        // Hoje em dia essa classe está em desuso.
    }
}