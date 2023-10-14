package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jonas silva");
        funcionario.setIdade(19);
        funcionario.setSalario(new double[]{1000, 900, 1200});
        funcionario.imprimeDados();
    }
}
