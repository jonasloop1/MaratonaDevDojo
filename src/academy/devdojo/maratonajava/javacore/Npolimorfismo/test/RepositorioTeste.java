package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        //Mais generico para o mais especifico!
        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio1 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio1.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Naruto");
        list.add("Monkey Di Luffy");
        System.out.println(list);
    }
}
