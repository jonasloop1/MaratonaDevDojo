package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;
    public Anime(String nome) {
        this.nome = nome;
    }
    //Para ter a certeza da sobrescrita colocamos a anotação Override.
    @Override
    public String toString(){
        return "Anime: "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
