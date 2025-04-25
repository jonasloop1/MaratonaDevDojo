package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Classe criada para facilitar a busca de paths.
 *
 * */
public class PathMatcherTest01 {
    public static void main(String[] args) {
        //Verificar se o arquivo dar um matcher
        //** ignora tudo do '.' para esquerda
        //**/* ignora tudo do '.' para esquerda, mesma função do anterior, porém muda o fato de poder alterar o '*' depois da '/'
        //**/*.??? -> tem que ter 3 letras na extenção após o '.'

        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/file.bkp"); //procurando pelo nome do arquivo
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path1, "glob:**/*.{bkp,txt,java}");//Não pode ter espaço entre as extenções
        matches(path2, "glob:**/*.{bkp,txt,java}");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + matcher.matches(path));
    }
}