package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
            //EXCEÇÃO MAIS GENERICA SEMPRE AO FINAL, ex.: RuntimeException
        }
        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            talvezLanceException2();
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        //Multi catch em linha, não pode estar na mesma linha de herança!
        //ex: IOException E FileNotFoundException estão na mesma linha de herança!
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        System.out.println("Dentro do método talvezLanceException");
    }

    private static void talvezLanceException2() throws IndexOutOfBoundsException, IllegalArgumentException {
        System.out.println("Dentro do método talvezLanceException2");
    }
}
