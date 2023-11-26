package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTestExercicio {
    public static void main(String[] args) {
        Local local = new Local("Rua das argulhas negras");
        Aluno aluno = new Aluno("Jonas", 18);
        Aluno[] alunosParaSeminario = {aluno};

        Professor professor = new Professor("Jiraya", "Ninja");
        Seminario seminario = new Seminario("A III Guerra Ninja", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
