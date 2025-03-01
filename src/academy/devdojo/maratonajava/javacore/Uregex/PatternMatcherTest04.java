package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regulares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Meta caractere:
        // [] retorna um Range de caracteres especificando o que o usuário deseja retornar
        // Exemplo: [abcAB] ou [a-zA-C]

        //Quantificadores: São caracteres que vão poder pegar determinada expressão baseada na quantidade que o meta caractere representa.
        // ? Zero ou uma ocorrências
        // * Zero ou mais ocorrências
        // + Uma ou mais ocorrências
        // {n,m} de n até m
        // () agrupamento
        // | ex.: o(v|c)o - vai dar um match nas ocorrências ovo ou oco
        // $ Fim de uma linha

        //Execicio: como fazer uma expressão regular que retorne todos os números hexadecimais validos num texto ou arquivo:

        System.out.println("\nMeta caractere:\n");

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

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