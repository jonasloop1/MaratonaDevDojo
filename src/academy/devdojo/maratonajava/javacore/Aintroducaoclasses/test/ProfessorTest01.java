package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "Mestre jonas";
        prof.idade = 21;
        prof.sexo = 'M';

        System.out.println(prof.nome + ", " + prof.idade + " anos, sexo: " + prof.sexo);
    }
}
