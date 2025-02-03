package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe LocalTime oferece
 * */
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,55,10);
        LocalTime timeNow = LocalTime.now();

        System.out.println("Definindo um horário: "+time);
        System.out.println("Horário atual do sistema: "+timeNow+" milissegundos");
        System.out.println("Retorna a hora: "+time.getHour());
        System.out.println("Retorna os minutos: "+time.getMinute());
        System.out.println("Retorna os segundos: "+time.getSecond());
        System.out.println("Retorna a primeira hora do dia: "+LocalTime.MIN);
        System.out.println("Retorna a útima hora do dia: "+LocalTime.MAX);
    }
}