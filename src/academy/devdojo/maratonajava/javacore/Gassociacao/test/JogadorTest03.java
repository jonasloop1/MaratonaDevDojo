package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador jogador3 = new Jogador("Messi");
        Jogador jogador4 = new Jogador("Maradona");
        Time time1 = new Time("Brasil");
        Time time2 = new Time("Argentina");
        Jogador [] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("--- Times ---");
        time1.imprime();
    }
}
