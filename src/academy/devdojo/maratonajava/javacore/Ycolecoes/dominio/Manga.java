package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;
/*
 * @author Jonas Silva
 * @e-mail: Jonasloop1@gmail.com
 * @param Sort, criando a própria regra usando o comparable para ordenar os elementos numa lista
 *
 * */

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nullo!");
        Objects.requireNonNull(nome, "Nome não pode ser nullo!");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(getPreco(), manga.getPreco()) == 0 && Objects.equals(getId(), manga.getId()) && Objects.equals(getNome(), manga.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getPreco());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroManga) {
//        Retorna negativo se o this < outroManga
//        Se this == outroMangar, retorna zero
//        Retorna positivo se o this > outroManga
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//        Todo código acima é substituído por este abaixo, só por estar usando um tipo wrapper(Long):
//        return this.id.compareTo(outroManga.getId());
//
//        Se quiser ordenar por preço é só transformar double em wrapper:
//        return Double.compare(preco, outroManga.getPreco()); Essa linha é a mesma coisa que a próxima.
        return Double.valueOf(preco).compareTo(outroManga.getPreco());

//        Se quiser ordenar por nome:
//        return this.nome.compareTo(outroManga.getNome());
    }
}