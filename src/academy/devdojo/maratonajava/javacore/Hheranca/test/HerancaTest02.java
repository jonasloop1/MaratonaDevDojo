package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicilização estático da super classe é executada quando a JVM carregar a classe pai;
    // 1 - Bloco de inicilização estático da sub classe é executada quando a JVM carregar a classe filha;
    // 2 - Alocado espaco em memória pro objeto da super classe;
    // 3 - Cada atributo da super classe é criado e inicializados com valores default ou o que for passado;
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece;
    // 5 - Construtor da super classe é executado;
    // 6 - Alocado espaco em memória pro objeto da sub classe;
    // 7 - Cada atributo da sub classe é criado e inicializados com valores default ou o que for passado;
    // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece;
    // 9 - Construtor da sub classe é executado;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jonas", "123.654.654-98");
    }
}
