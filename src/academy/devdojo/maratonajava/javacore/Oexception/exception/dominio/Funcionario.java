package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    //Exceções do tipo RuntimeException (Unchecked) não são obrigados os devidos tratamentos!
    public void salvar() throws LoginInvalidoException, RuntimeException{
        System.out.println("Salvando funcionario");
    }
    //Quando um método e sobrescrito não é necessário declarar as mesmas exceções
}
