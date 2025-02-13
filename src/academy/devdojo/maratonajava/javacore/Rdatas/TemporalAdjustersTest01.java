package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe TemporalAdjusters oferece!
 * Todos os métodos dessa classe são estáticos.
 * Muito utilizada para fazer ajustes no tempo.
 * */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now1 = LocalDate.now();
        LocalDate now2 = LocalDate.now();
        LocalDate now3 = LocalDate.now();

        now = now.plusDays(16);
        now1 = now1.withDayOfMonth(28);
        now2 = now2.with(ChronoField.DAY_OF_MONTH, 27);

        System.out.println("\nAcima de 15 dia o plusDays vira o mês: " + now);
        System.out.println("Método withDayOfMonth soluciona o problema: " + now1);
        System.out.println("Outra forma de fixa a data: " + now2);
        System.out.println("Retorna o dia da semana: " + now.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println("\nRetorna a mesma data: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("\nRetorna a próxima quinta: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println("\nRetorna a última quinta: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("\nRetorna o primeiro dia do mês: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("\nRetorna o último dia do mês: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());

        now3 = now3.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("\nRetorna o primeiro dia do próximo ano: " + now3);
        System.out.println("Dia da semana: " + now3.getDayOfWeek());
    }
}