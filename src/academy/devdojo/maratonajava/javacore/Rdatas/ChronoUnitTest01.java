package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe ChronoUnit oferece!
 * Trabalha com todas as grandezas anos, meses, dias, semanas, micro, nano, segundos...
 * Muito utilizado para trabalhar com range de datas.
 *
 * */

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2000, Month.SEPTEMBER, 10, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Para saber a quantidade de dias do aniversário até hoje!");
        System.out.println(ChronoUnit.DAYS.between(aniversario, now) + " Dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now) + " Semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now) + " Meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now) + " Anos");
    }
}