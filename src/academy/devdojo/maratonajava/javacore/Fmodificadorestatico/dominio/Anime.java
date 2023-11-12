package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carrega a classe.
    // Bloco de inicialização estático e inicializado apenas uma vez.

    static {
        System.out.println("Dentro do bloco de inicialização estático 1!");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2!");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3!");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 4!");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO ESTÁTICO!");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int arrEpsodios : Anime.episodios) {
            System.out.print(arrEpsodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
