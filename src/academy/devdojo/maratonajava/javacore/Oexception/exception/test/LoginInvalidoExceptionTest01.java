package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {

            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String userNameDB = "Goku";
        String senhaDB = "SSJ";

        System.out.println("Usuário:");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitado = teclado.nextLine();

        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitado)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Usuário logado com sucesso");
    }
}
