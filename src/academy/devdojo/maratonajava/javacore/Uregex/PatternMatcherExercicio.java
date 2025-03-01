package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regulares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExercicio {
    public static void main(String[] args) {
        // Meta caractere:
        // [] retorna um Range de caracteres especificando o que o usuário deseja retornar
        // Exemplo: [abcAB] ou [a-zA-C]

        //Execicio: como fazer uma expressão regular que retorne todos os números hexadecimais validos num texto ou arquivo:

        System.out.println("\nMeta caractere:\n");

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);

        System.out.println("\nPosição e valores encontrados");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        // No java, "0x" ou "0X" no início de um número, significa hexadecimal.
        int numeroHexa = 0x59F86A;
        System.out.println("\nRetorna um decimal convertido: "+numeroHexa);
    }
}