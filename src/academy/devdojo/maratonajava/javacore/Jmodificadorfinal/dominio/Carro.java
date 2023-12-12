package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    //Classes e métodos também podem ter o modificador final ex.: ' public final classe Carro(){} '
    //Não pode subrescrever um método com modificado 'final'
    private String nome;
    //O modificador "final" defini uma variavel constante e uma palavra reservada.
    //Geralmente as constantes são escritas com letra maisculas e underscore.
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
