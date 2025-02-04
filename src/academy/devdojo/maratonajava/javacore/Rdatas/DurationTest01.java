package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe Duration oferece!
 * Feita para trabalhar com a quantidade de tempo,
 * Utilizada quando você quer pegar um intervalo entre duas data,
 * Para saber quantos dias e horas se passaram!
 * Baseado em milissegundos e nanossegundos!
 *
 * */

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYear = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYear);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(20);
        Duration d6 = Duration.of(5, ChronoUnit.HOURS);

        System.out.println("\nQuantidade de dias, horas e nanossgundo que se pasaram: " + d1);
        System.out.println("Diferença entre as horas, quantidade: " + d2);
        System.out.println("Diferença de minutos: " + d3);

        System.out.println("\nOutros métodos, Duration retorna horas, minutos e segundos:");
        System.out.println("20 dias em horas: " + d4);
        System.out.println("20 dias em horas: " + d5);
        System.out.println("20 dias em horas: " + d6);

        System.out.println("\nAtenção: a classe Duration não aceita LocalDate, porque localDate não tem suporte para segundos!");
    }
}