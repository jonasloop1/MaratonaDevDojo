package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe LocalDateTime oferece
 * @param Essa classe oferece uma junção de métodos da classe LocalTime e LocalDate
 * */
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDtime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-08-31");
        LocalTime time = LocalTime.parse("12:45:00");

        System.out.println("Retorna a data e hora atual: "+localDtime);
        System.out.println("Transforma uma String em Date: "+date);
        System.out.println("Transforma uma String em Time: "+time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        LocalDateTime ldt3 = date.atTime(17,50,20);

        System.out.println("Retorna a data junto com a hora, tinha o dia e adicionou a hora: "+ldt1);
        System.out.println("Retorna a data junto com a hora, tinha a hora e adicionou o dia: "+ldt2);
        System.out.println("Retorna a data junto com a hora, porém com a hora pré setado: "+ldt3);
    }
}