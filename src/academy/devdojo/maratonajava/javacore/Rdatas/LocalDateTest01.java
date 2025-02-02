package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com formatação de datas de forma mais abrangente, depois de grandes atualizações
 * */
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.FEBRUARY, 1);
        LocalDate agora = LocalDate.now();

        System.out.println("Retorna o ano: " +date.getYear());//Retorna o ano
        System.out.println("Retorna o mês: " +date.getMonth());//Retorna o mês
        System.out.println("Retorna o dia da semana: " +date.getDayOfWeek());//Retorna o dia da semana
        System.out.println("Retorna o valor do mês, ex.: Janeiro = 1, Fevereiro = 2...: " +date.getMonthValue());//Retorna o valor do mês, ex.: Janeiro = 1, Fevereiro = 2...
        System.out.println("Retorna dia no mês: " +date.getDayOfMonth());//Retorna dia no mês.
        System.out.println("Retorna a quantidade de dias no mês: " +date.lengthOfMonth());//Retorna a quantidade de dias no mês.
        System.out.println("Para saber se o ano é Bi Sexto. Se true: o ano é Bi Sexto, se false: o ano não é Bi Sexto -> " +date.isLeapYear());
        System.out.println("Data de hoje: " +agora);
        System.out.println("Data maxima que pode se utilizar: " +LocalDate.MAX);
        System.out.println("Data minima que pode se utilizar: " +LocalDate.MIN);
    }
}