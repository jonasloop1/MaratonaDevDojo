package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe Instant oferece
 * Parecida com a classe Date que trabalha com milissegundos, já a instant trabalha com nanossegundos.
 *
 * */
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instantNow = Instant.now();
        System.out.println("\nComparando instant: "+instantNow+" com o date: "+ LocalDateTime.now());
        System.out.println("A diferença é o 'Z' zulu time, também parecido com utc time!");
        System.out.println("Zulu time é um tipo de horário neutro! Usado para saber o horário de cada zona ou pais!\n");

        System.out.println("Retorna um long: "+instantNow.getEpochSecond());
        System.out.println("Retorna um inteiro, representado em nanossegundos: "+ instantNow.getNano());
        System.out.println("Retorna os segundos de 1970-01-01 em zulu time: "+Instant.ofEpochSecond(5));
        System.out.println("Adicionando os nanossegundos: "+Instant.ofEpochSecond(5,2_000_000_000));
        System.out.println("Diminuindo os nanossegundos: "+Instant.ofEpochSecond(5,-1_000_000_000));
        System.out.println("\nClasse ótima para quem trabalha com aplicações, onde você não precisa saber dia, mês, ano e hora!");
    }
}