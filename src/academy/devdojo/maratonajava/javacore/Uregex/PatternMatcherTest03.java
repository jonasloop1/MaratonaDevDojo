package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regulares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Meta caractere:
        // [] retorna um Range de caracteres especificando o que o usuário deseja retornar
        // Exemplo: [abcAB] ou [a-zA-C]

        System.out.println("\nMeta caractere:\n");

        String regex = "[a-zA-C]";
        String texto = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);

        System.out.println("\nPosição e valores encontrados");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}