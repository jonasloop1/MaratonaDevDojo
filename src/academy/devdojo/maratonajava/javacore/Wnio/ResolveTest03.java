package academy.devdojo.maratonajava.javacore.Wnio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Entrada e saída de dados.
 * Trabalhando com a classe NIO, Resolve;
 * Resolve o caminho dos paths organizando em estrutura sequenciais;
 *
 * */
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {

        Path dir = Paths.get("home/jonas"); //caminho relativo
        Path arquivoTxt = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivoTxt);
        System.out.println(resolve);

        //Não tem como resolver caminho absoluto
        //Caminho relativo da para resolver usando um absoluto;

        Path absolute = Paths.get("/home/jonas");
        Path relative = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("\n1 - caminho relativo resolvido com absoluto   " + absolute.resolve(relative));
        System.out.println("2 - caminho resolvido com o caminho absoluto  " + absolute.resolve(file));
        System.out.println("3 - não se resolve caminho absoluto           " + relative.resolve(absolute));
        System.out.println("4 - caminho resolvido com relative            " + relative.resolve(file));
        System.out.println("5 - não se resolve caminho absoluto           " + file.resolve(absolute));
        System.out.println("6 - caminho resolvido com o caminho absoluto  " + file.resolve(relative));
    }
}
