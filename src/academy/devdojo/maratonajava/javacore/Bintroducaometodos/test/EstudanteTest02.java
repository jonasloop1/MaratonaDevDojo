package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Sasuke";
        estudante1.idade = 16;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 15;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
