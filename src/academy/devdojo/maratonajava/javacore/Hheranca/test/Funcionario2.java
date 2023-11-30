package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {

    public Funcionario2(String nome) {
        super(nome);
    }

    public void imprime() {
        this.nome = "Jonas";
        this.cpf = "123.654.343-34";
    }
}
