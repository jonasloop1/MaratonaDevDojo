package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regulares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Meta caracteres:
        // \d = retorna todos os dígitos.
        // \D = retorna o que não for dígitos.
        // \s = retorna todos espaço em branco. \t = table, \n \f r
        // \S = retorna todos os caracteres excluindo os brancos.
        // \w = retorna tudo entre a-ZA-Z, dígitos, _
        // \W = tudo o que não for incluo no \w

        System.out.println("\nMeta caracteres:\n");
        String regex = "\\S";
        String texto = "@#i2 n_5m1";

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