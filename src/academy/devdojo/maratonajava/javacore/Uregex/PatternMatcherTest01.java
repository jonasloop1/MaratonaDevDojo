package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regurlares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * Muito utilizado para achar uma determinada expressão num imenso arquivo de texto.
 * Utiliza também validações. ex.: verificar se o e-mail está escrito de forma correta sintaticamente. exemplo123@gmail.com
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        System.out.println("\nEntendendo o comportamento das expressões regulares\n");
        String regex = "ab";
        String texto = "abaaba";
        String regex1 = "aba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher2 = pattern1.matcher(texto2);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("---------------------");
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex1);

        System.out.println("\nPosições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

        System.out.println("\n---------------------");

        System.out.println("Posições encontradas 2");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " ");
        }
    }
}