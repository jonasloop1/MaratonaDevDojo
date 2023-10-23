package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //Criando um objeto passos:
    //1- Criado um espaço em memória para o obejeto;
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    //3- bloco de inicialização, executado primeiro que o próprio construtor;
    //4- Construtor e executado.
    {
        System.out.println("Dentro do bloco de inicialização!");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int arrEpsodios : this.episodios) {
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
