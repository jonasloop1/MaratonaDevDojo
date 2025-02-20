package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe Zone oferece!
 * */

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println("\nRetornar todas Zonas que o JAVA oferece: " + shortIds);
        System.out.println("\nRetornar a ZONA de acordo com o sistema operacional: " + ZoneId.systemDefault());

        ZoneId zoneAsiaTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println("\nSetando a zona de: " + zoneAsiaTokyo);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nLocalDateTime não oferece uma data e hora de acordo com a zona: " + now);

        ZonedDateTime zonedDateTime = now.atZone(zoneAsiaTokyo);
        System.out.println("\nRetorna o horário e data de acordo com a zona: " + zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println("\nRetorna hora e data em ZuluTime: " + nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(zoneAsiaTokyo);
        System.out.println("\nRetornar a data e hora já aplicada: " + zonedDateTime2);

        System.out.println("\nQuantidade de horas que você pode adicionar ou remover:");
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        //Sabe o horário, mas não sabe a ZONA:
        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);
        System.out.println("\nRetorna a data e horário atual menos o horário estabelecido, sem a zona: " + offsetDateTime1);
        //Outra forma de declarar:
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println("\nRetorna a data e horário atual menos o horário estabelecido, sem a zona: " + offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println("\nRetorna a hora e data atual de Manaus: " + offsetDateTime3);
    }
}