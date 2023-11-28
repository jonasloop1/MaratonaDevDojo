package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3 de Novembro");
        endereco.setCep("23025-080");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jonas silva");
        pessoa.setCpf("181.767.435-64");
        pessoa.setEndereco(endereco);
        System.out.println("*******************");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rafael");
        funcionario.setCpf("143.124.231-98");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);

        funcionario.imprime();
    }
}
