package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login ou senha inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
