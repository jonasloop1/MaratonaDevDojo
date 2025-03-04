package academy.devdojo.maratonajava.javacore.Uregex;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Expressões regulares é uma linguagem desenvolvida que utiliza meta caracteres (símbolos).
 * */

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . ex.: 1.3 vai procurar -> 123, 133, 1@3,1A3...

        //Exercício: Expressão que retorne todos e-mails válidos baseado em um texto:

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@gmail.com, 123Jn@gmai.com.br, @#$zorinho@hotmail.com, sakura444@hot";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        //A classe String tem um método que faz válidação.
        //Método trim() remove espaços em branco.

        System.out.println("\nE-mail válido: @#$zorinho@hotmail.com");
        System.out.println("@#$zorinho@hotmail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

        System.out.println("\nMeta caractere:\n");

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);

        System.out.println("\nPosição e valores encontrados");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}